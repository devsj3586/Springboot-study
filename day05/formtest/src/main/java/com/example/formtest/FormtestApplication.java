package com.example.formtest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.formtest.mapper"})
public class FormtestApplication {
    public static void main(String[] args) {
        SpringApplication.run(FormtestApplication.class, args);
    }

}
