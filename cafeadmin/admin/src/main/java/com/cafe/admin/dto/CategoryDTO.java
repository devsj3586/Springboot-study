package com.cafe.admin.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class CategoryDTO {

    private int id;
    private String cateName;
    private String cateType;
    private String indate;

}
