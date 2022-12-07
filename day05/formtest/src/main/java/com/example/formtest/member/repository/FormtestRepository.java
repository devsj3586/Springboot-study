package com.example.formtest.member.repository;

import com.example.formtest.mapper.FormtestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;


@Repository
public class FormtestRepository {
    // mapper 연결
    @Autowired
    FormtestMapper mapper;
    // HashMap으로 params가져오기
    public void insertForm(HashMap<String, String> params) {
        // 반환
         mapper.insertForm(params);
    }

    public void selectForm (String email) {
        mapper.selectForm(email);
    }

    public void loginMember(HashMap<String,String> param){
        mapper.loginMember(param);
    }

}
