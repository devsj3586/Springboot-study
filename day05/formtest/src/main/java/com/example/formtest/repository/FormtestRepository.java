package com.example.formtest.repository;

import com.example.formtest.mapper.FormtestMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;

@Repository
public class FormtestRepository {

    @Autowired
    FormtestMapper mapper;

    public  insertForm (HashMap<String, String> param) {

    }
}
