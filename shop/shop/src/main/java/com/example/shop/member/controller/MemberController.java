package com.example.shop.member.controller;

import com.example.shop.member.dto.Member;
import com.example.shop.member.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MemberController {

    @Autowired
    MemberService ms;

    @PostMapping("/signup")
    public int signup (Member member) {
        return  ms.signup(member);
    }
}
