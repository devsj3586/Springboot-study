package com.example.formtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface FormtestMapper {
    // XML에서 가져오기
    String insertForm (HashMap<String, String> params);

}


