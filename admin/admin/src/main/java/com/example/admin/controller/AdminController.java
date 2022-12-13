package com.example.admin.controller;

import com.example.admin.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.HashMap;

@RestController
public class AdminController {

    @Autowired
    AdminService as;

    @GetMapping("/selectMember")
    public ArrayList<HashMap<String, Object>> selectMember() {
        return as.selectMember();
    }

    @GetMapping("/selectPayment")
    public ArrayList<HashMap<String, Object>> selectPayment() {
        return as.selectPayment();
    }

    @GetMapping("/selectBuy")
    public ArrayList<HashMap<String, Object>> selectBuy() {
        return as.selectBuy();
    }

    @GetMapping("/selectContact")
    public ArrayList<HashMap<String, Object>> selectContact() {
        return as.selectContact();
    }

    @GetMapping("/selectSubscribe")
    public ArrayList<HashMap<String, Object>> selectSubscribe() {
        return as.selectSubscribe();
    }

    @GetMapping("/selectCntMember")
    public int selectCntMember() {
        return as.selectCntMember();
    }

    @GetMapping("/selectAmountPayment")
    public double selectAmountPayment() {
        return as.selectAmountPayment();
    }

    @GetMapping("/selectCntBuy")
    public int selectCntBuy() {
        return as.selectCntBuy();
    }

    @GetMapping("/selectCntContact")
    public int selectCntContact() {
        return as.selectCntContact();
    }

}
