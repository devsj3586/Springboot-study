package com.example.formtest.member.controller;

import com.example.formtest.service.FormtestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
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

}
