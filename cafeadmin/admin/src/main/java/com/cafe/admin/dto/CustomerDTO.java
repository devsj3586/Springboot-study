package com.cafe.admin.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
@ToString
public class CustomerDTO {

    private String id;
    private String pw;
    private String name;
    private String phone;
    private String address;
    private String email;
    private String gender;
    private String sns;
    private String birth;
    private String indate;
    private String ismem;

}
