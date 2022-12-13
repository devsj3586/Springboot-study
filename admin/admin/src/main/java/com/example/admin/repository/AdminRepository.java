package com.example.admin.repository;

import com.example.admin.mapper.AdminMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class AdminRepository {

    @Autowired
    AdminMapper mapper;

    public HashMap<String, Object> loginAdmin(HashMap<String, String> param) {
        return mapper.loginAdmin(param);
    }

    public ArrayList<HashMap<String, Object>> selectMember() {
        return mapper.selectMember();
    }

    public ArrayList<HashMap<String, Object>> selectPayment() {
        return mapper.selectPayment();
    }

    public ArrayList<HashMap<String, Object>> selectBuy() {
        return mapper.selectBuy();
    }

    public ArrayList<HashMap<String, Object>> selectContact() {
        return mapper.selectContact();
    }

    public int selectCntMember() {
        return mapper.selectCntMember();
    }

    public double selectAmountPayment() {
        return mapper.selectAmountPayment();
    }

    public int selectCntBuy() {
        return mapper.selectCntBuy();
    }

    public int selectCntContact() {
        return mapper.selectCntContact();
    }

}
