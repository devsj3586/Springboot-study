package com.example.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface AdminMapper {

    HashMap<String, Object> loginAdmin(HashMap<String, String> param);

    ArrayList<HashMap<String, Object>> selectMember();

    ArrayList<HashMap<String, Object>> selectPayment();

    ArrayList<HashMap<String, Object>> selectBuy();

    ArrayList<HashMap<String, Object>> selectContact();

    ArrayList<HashMap<String, Object>> selectSubscribe();

    int selectCntMember();

    double selectAmountPayment();

    int selectCntBuy();

    int selectCntContact();

}
