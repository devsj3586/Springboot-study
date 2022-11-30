package com.example.formtest.member.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class MemberController {

    public ArrayList<HashMap<String, String>> memberList = new ArrayList<>();

    @GetMapping("/signup")
    public String signUp(@RequestParam HashMap<String, String> params) {
        memberList.add(params);
        return "index";
    }

}
