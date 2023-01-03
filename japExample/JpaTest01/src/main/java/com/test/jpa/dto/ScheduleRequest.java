package com.test.jpa.dto;

import com.test.jpa.entity.Schedule;
import com.test.jpa.entity.User;
import lombok.*;
import org.springframework.scheduling.annotation.Schedules;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
public class ScheduleRequest {

    private String email;   // 등록자
    private String title;   // 스케줄제목
    private String date;    // 스케쥴일자

    // Entity로 변환이 되서 데이터베이스로 들어가는
    public Schedule toEntity() {
        return Schedule.builder()
                .user(User.builder().email(email).build())
                .title(title)
                .date(date)
                .build();
    }
}
