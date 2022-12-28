package com.example.shop.product.repository;

import com.example.shop.mapper.ProductMapper;
import com.example.shop.product.dto.Product;
import com.example.shop.util.SearchDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ProductRepository {

    @Autowired
    ProductMapper pm;

    List<Product> selectProduct(SearchDto searchDto);
}public
