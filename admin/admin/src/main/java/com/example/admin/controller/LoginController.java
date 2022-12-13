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
public class LoginController {
    @Autowired
    AdminService as;

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
}
