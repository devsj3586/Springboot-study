package com.example.shop.product.Controller;

import com.example.shop.product.dto.Product;
import com.example.shop.product.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    ProductService ps;

    @
    public List<Product> selectProduct(Product product) {
        return ps.selectProduct(product);
    }
}
