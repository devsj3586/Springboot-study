package com.example.shop.product.service;

import com.example.shop.product.dto.Product;
import com.example.shop.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    ProductRepository pr;

    public List<Product> selectProduct(Product product) {
        return pr.selectProduct(product);
    }

}
