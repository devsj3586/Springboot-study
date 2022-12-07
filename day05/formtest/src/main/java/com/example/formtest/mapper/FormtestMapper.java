package com.example.formtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;

@Mapper
public interface FormtestMapper {
    // XML에서 가져오기
    void insertForm (HashMap<String, String> params);

    void selectForm (String email);

    void loginMember (HashMap<String, String> param);
}


