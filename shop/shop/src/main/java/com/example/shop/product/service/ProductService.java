package com.example.shop.product.service;

import com.example.shop.product.dto.Product;
import com.example.shop.product.dto.ProductList;
import com.example.shop.product.repository.ProductRepository;
import com.example.shop.util.Pagination;
import com.example.shop.util.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public ProductList findAll(SearchDto searchDto){

        int count = pr.count(searchDto);
        if (count < 1) {
            return new ProductList(Collections.emptyList(), null);
        }
        Pagination pagination = new Pagination(count, searchDto);
        searchDto.setPagination(pagination);

        List<Product> list = pr.selectProduct(searchDto);

        return  new ProductList(list, pagination);
    }

    public int selectAvailAmount(HashMap<String,String> params){
        return pr.selectAvailAmount(params);
    }
    public List<HashMap<String, Object>> checkAvailProductId(){
        return pr.checkAvailProductId();
    }
    public HashMap<String, Object> checkAmountProduct(HashMap<String, String> params){
        return pr.checkAmountProduct(params);
    }
}
