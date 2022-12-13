package com.example.admin.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import javax.servlet.http.HttpSession;

@Component
@Aspect // AOP 할때 애너테이션 둘다 사용
public class AdminAop {

    @Pointcut("execution(* com.example.admin.controller.AdminController.*(..))")
    public void cut() {
    }

    @Around("cut()")
    public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
        HttpSession session = ((ServletRequestAttributes) RequestContextHolder.currentRequestAttributes()).getRequest().getSession();

        if (session.getAttribute("id") == null) {  // 로그인을 했을때
            return null;
        } else {
            return joinPoint.proceed();   // 로그인 안했을때
        }
    }

}
