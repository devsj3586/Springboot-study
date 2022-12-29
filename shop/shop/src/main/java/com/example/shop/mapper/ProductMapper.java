package com.example.shop.mapper;

import com.example.shop.product.dto.Product;
import com.example.shop.util.SearchDto;
import org.apache.ibatis.annotations.Mapper;

import java.util.HashMap;
import java.util.List;

@Mapper
public interface ProductMapper {

    List<Product> selectProduct(SearchDto searchDto);

    int count(SearchDto searchDto);

    int selectAvailAmount(HashMap<String, String> params);

    List<HashMap<String, Object>> checkAvailProductId();

    HashMap<String, Object> checkAmountProduct(HashMap<String, String> params);

}

