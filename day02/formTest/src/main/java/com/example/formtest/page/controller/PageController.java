package com.example.formtest.page.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpSession;

@Controller
public class PageController {

    @GetMapping("/")
    public String index() {
        return "index";
    }

    @GetMapping("/goSignUp")
    public String goSignUp() {
        return "signup";
    }

    @GetMapping("/goLogin")
    public String goLogin() {
        return "login";
    }

    @GetMapping("/goMember")
    public String goMember(HttpSession session) {
        if (session.getAttribute("email") == null) {
            return "signup";
        } else {
            return "index";
        }
    }

    @GetMapping("/logout")
    public String logOut (HttpSession session)  {
        session.setAttribute("email", null);
        return "index";
    }
}
