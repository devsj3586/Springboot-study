package com.test.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedule")
@Builder
@Getter
public class Schedule {
    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String title;

    @Column
    private String date;
    // 1: 다 관계  ManyToOne FetchType.EAGER 도 가능
    @ManyToOne (fetch = FetchType.LAZY) //EAGER : 1:1 같은 테이블 처럼 욺직일때, LAZY :
    @JoinColumn(name = "email")
    private User user;

}
