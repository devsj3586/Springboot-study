package com.example.jpaexample.entity;

import lombok.*;

import javax.persistence.*;

@NoArgsConstructor  // 파라미터 안받는 생성자
@AllArgsConstructor // 파라미터 받는 생성자
@Getter
@Setter
@Builder
@Entity
@Table(name="Example")
public class Example {  // Entity 가 데이터 베이스라 생각하면됨 잘만들어야함

    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY) // pk 자동 증가
    private Long id;
    @Column(name="name",nullable=true,length=20) // nullable : not null / null 체크랑 비슷
    private String name;
    @Column(name="price",nullable=false,length=20)  //length 길이
    private int price;

}
