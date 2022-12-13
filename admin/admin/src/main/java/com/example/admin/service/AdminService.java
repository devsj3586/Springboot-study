package com.example.admin.service;

import com.example.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;

@Service
public class AdminService {
    @Autowired
    AdminRepository ar;

    public HashMap<String, Object> loginAdmin(HashMap<String, String> param) {
        return ar.loginAdmin(param);
    }

    public ArrayList<HashMap<String, Object>> selectMember() {
        return ar.selectMember();
    }

    public ArrayList<HashMap<String, Object>> selectPayment() {
        return ar.selectPayment();
    }

    public ArrayList<HashMap<String, Object>> selectBuy() {
        return ar.selectBuy();
    }

    public ArrayList<HashMap<String, Object>> selectContact() {
        return ar.selectContact();
    }

    public int selectCntMember() {
        return ar.selectCntMember();
    }

    public double selectAmountPayment() {
        return ar.selectAmountPayment();
    }

    public int selectCntBuy() {
        return ar.selectCntBuy();
    }

    public int selectCntContact() {
        return ar.selectCntContact();
    }
}
