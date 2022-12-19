package com.example.admin.controller;

import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.HashMap;

@Controller
public class PageController {

    @Autowired
    AdminService as;

    @GetMapping("/")
    public String login() {
        return "login";
    }

    @PostMapping("/login")
    public String loginAdmin(@RequestParam HashMap<String, String> param, HttpSession session) {
        HashMap<String, Object> result = as.loginAdmin(param);
        if (result != null) {
            String id = String.valueOf(result.get("id"));
            session.setAttribute("id", id);
            return "redirect:/index";
        }
        return "redirect:/";
    }

    @GetMapping("/logout")
    public String logout(HttpSession session) {
        session.invalidate();
        return "redirect:/";
    }
    @GetMapping("/index")
    public String index() {
        return "index";
    }


    @GetMapping("/goMember")
    public String goMember() {
        return "memberList";
    }

    @GetMapping("/goPayment")
    public String goPayment() {
        return "paymentList";
    }

    @GetMapping("/goBuy")
    public String goBuy() {
        return "buyList";
    }

    @GetMapping("/goContact")
    public String goContact() {
        return "contactList";
    }

    @GetMapping("/goSubscribe")
    public String goSubscribe() {
        return "subscribeList";
    }
}
