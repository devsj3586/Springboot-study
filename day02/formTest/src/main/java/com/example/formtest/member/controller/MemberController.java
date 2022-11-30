package com.example.formtest.member.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

// 같은 아이디 등록 X
// 빈값 넣었을때 등록 X
@Controller
public class MemberController {

    ArrayList<HashMap<String, String>> memberList = new ArrayList<>();

    @PostMapping("/signup")
    public String signup (@RequestParam HashMap<String, String> params) {
        memberList.add(params);

        return "index";
    }

    @PostMapping("/login")
    public String login (@RequestParam HashMap<String, String> params,HttpSession session) {

        params.get("email");
        params.get("password");

        for (HashMap<String, String> mem : memberList) {
            if (params.get("email").equals(mem.get("email")) && params.get("password").equals(mem.get("password"))) {
                // 가입된 회원인 경우
                session.setAttribute("email",mem.get("email"));
            }

        }

        return "index";
    }

}
