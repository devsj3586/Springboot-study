package com.cafe.admin.dto;

import com.cafe.admin.entity.Admin;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class AdminReqDTO {
    private String id;
    private String password;

    public Admin toEntity() {
        return Admin.builder()
                .id(id)
                .password(password)
                .build();
    }
}
