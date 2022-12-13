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
    public HashMap<String,Object> loginAdmin(HashMap<String,String> param){
        return ar.loginAdmin(param);
    }

    public int selectCntMember() {
        return ar.selectCntMember();
    }

    public double selectAmountPayment() {
        return ar.selectAmountPayment();
    }


}
