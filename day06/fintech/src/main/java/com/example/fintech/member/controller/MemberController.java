package com.example.fintech.member.controller;

import com.example.fintech.member.dto.MemberDto;
import com.example.fintech.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

@Controller
public class MemberController {
    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public String insertMember(MemberDto MemberDto) {
        ms.insertMember(MemberDto);
        return "index";
    }

    @PostMapping("/login")
    public String login(String email, String password, HttpSession session) {
        MemberDto loginMember = ms.loginMember(email, password);
        if (loginMember != null) {
            session.setAttribute("email", email);
            return "index";
        }
        return "login";
    }
}

