package com.example.jpaexample.dto;

import com.example.jpaexample.entity.Example;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString // 5개 종합 어노테이션 @Data
public class ExampleReqDTO { // request DTO  들어오는

    private Long id;
    private String name;
    private int price;

    // DTO를 entity를 변환하는 메서드 작성
    public Example toEntity() {      // builder 사용 ,  매개변수를 많을 때  하나씩 넣다 실수할수도있음
        return Example.builder()
                .id(id)
                .name(name)
                .price(price)
                .build();
    }

}
