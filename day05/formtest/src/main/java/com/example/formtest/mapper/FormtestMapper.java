package com.example.formtest.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface FormtestMapper {
    ArrayList<HashMap<String, String>> insertForm ();
}


