package com.test.jpa.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "schedule_user")
@Builder
@Getter
public class User {

    @Id
    @Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    // 1 대 다 관계
    // 상속관계
    @OneToMany(fetch = FetchType.LAZY)
    @OrderBy("date DESC")
    private List<Schedule> schedules;
}
