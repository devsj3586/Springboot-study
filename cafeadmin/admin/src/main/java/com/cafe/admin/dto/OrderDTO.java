package com.cafe.admin.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class OrderDTO {
    private int id;
    private String userid;
    private String name;
    private String phone;
    private String address;
    private String addressdetail;
    private String indate;
    private String productName;
    private int price;
    private int amount;
}
