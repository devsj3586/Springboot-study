package com.example.admin.controller;

import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.HashMap;

@Controller
public class AdminController {

    @Autowired
    AdminService as;

    @PostMapping("/login")
    public String loginAdmin(@RequestParam HashMap<String, String> param, HttpSession session) {
        HashMap<String, Object> result = as.loginAdmin(param);
        if (result == null) {
            return "redirect:/";
        }
        return "redirect:/index";
    }

    @GetMapping("/selectMember")
    public @ResponseBody ArrayList<HashMap<String, Object>> selectMember() {
        return as.selectMember();
    }

    @GetMapping("/selectCntMember")
    public @ResponseBody int selectCntMember() {
        return as.selectCntMember();
    }

    @GetMapping("/selectAmountPayment")
    public @ResponseBody double selectAmountPayment() {
        return as.selectAmountPayment();
    }

    @GetMapping("/selectCntBuy")
    public @ResponseBody int selectCntBuy() {
        return as.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    public @ResponseBody int selectCntContact() {
        return as.selectCntContact();
    }

}
