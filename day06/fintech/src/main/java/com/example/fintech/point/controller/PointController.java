package com.example.fintech.point.controller;

import com.example.fintech.point.dto.PointDto;
import com.example.fintech.point.service.PointService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

@Controller
public class PointController {

    @Autowired
    PointService ps;

    @GetMapping("/point")
    public @ResponseBody String insertPoint(PointDto pointDto, HttpSession session) {
        if (session.getAttribute("email") != null) {
        String email = String.valueOf(session.getAttribute("email"));
        ps.insertPoint
        }
        return "goPay";
    }
}
