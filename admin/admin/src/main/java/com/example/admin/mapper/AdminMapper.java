package com.example.admin.mapper;

import org.apache.ibatis.annotations.Mapper;

import java.util.ArrayList;
import java.util.HashMap;

@Mapper
public interface AdminMapper {

    HashMap<String,Object> loginAdmin(HashMap<String,String> param);

    ArrayList<HashMap<String, Object>> selectMember();

    int selectCntMember();
    double selectAmountPayment();

    int selectCntBuy();

}
