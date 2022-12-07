package com.example.formtest.member.service;

import com.example.formtest.member.repository.FormtestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormtestService {
    // Repository 연결
    @Autowired
    FormtestRepository fr;
    // HashMap 으로 params 받아 리턴
    public void insertForm(HashMap<String, String> params) {
        fr.insertForm(params);
    }

    public void loginMember(HashMap<String,String> param){
        fr.loginMember(param);
    }
}
