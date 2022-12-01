package com.example.formtest.service;

import com.example.formtest.repository.FormtestRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

@Service
public class FormtestService {
    // Repository 연결
    @Autowired
    FormtestRepository fr;
    // HashMap 으로 params 받아 리턴
    public String insertForm(HashMap<String, String> params) {
        return fr.insertForm(params);
    }
}
