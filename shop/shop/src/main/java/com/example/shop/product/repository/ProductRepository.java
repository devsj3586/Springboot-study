package com.example.shop.product.repository;

import com.example.shop.mapper.ProductMapper;
import com.example.shop.product.dto.Product;
import com.example.shop.util.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper pm;

    public List<Product> selectProduct(SearchDto searchDto){
        return pm.selectProduct(searchDto);
    }
    public int count(SearchDto searchDto){
        return pm.count(searchDto);
    }
    public int selectAvailAmount(HashMap<String,String> params){
        return pm.selectAvailAmount(params);
    }
    public List<HashMap<String, Object>> checkAvailProductId(){
        return pm.checkAvailProductId();
    }
    public HashMap<String, Object> checkAmountProduct(HashMap<String, String> params){
        return pm.checkAmountProduct(params);
    }
}
