package com.cafe.admin.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class SellTimeDTO {

    private int id;
    private String startTime;
    private String endTime;
    private String indate;

}
