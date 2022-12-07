package com.example.fintech;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.fintech.mapper"})
public class FintechApplication {
    public static void main(String[] args) {
        SpringApplication.run(FintechApplication.class, args);
    }

}
