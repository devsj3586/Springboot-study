package com.test.jpa.service;

import com.test.jpa.dto.ScheduleRequest;
import com.test.jpa.dto.ScheduleResponse;
import org.apache.catalina.LifecycleState;

import java.util.List;

public interface ScheduleService {

    // 컨트롤러에서 사용할 메서드 작성
    // 스케줄 목록
    List<ScheduleResponse> scheduleList(String email);

    // 스케줄 삭제
    String deleteSchedules(String id);

    // 스케쥴 등록
    String insertSchedules(ScheduleRequest scheduleRequest);
}
