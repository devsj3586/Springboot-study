package com.example.formtest.member.controller;

import com.example.formtest.member.service.FormtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@Controller
public class MemberController {
    // Service 연결
    @Autowired
    FormtestService fs;
    // 컨트롤러 연결
    @PostMapping("/signup")
    // HashMap으로 받아 리턴 하기 ,
    public String insertForm(@RequestParam HashMap<String, String> params) {
        fs.insertForm(params);
        return "index";
    }
    @PostMapping("/login")
    public String loginMember(HashMap<String,String> param){
        fs.loginMember(param);
        return "index";
    }
}
