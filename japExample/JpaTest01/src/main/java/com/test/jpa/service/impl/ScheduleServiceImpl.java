package com.test.jpa.service.impl;

import com.test.jpa.dto.ScheduleRequest;
import com.test.jpa.dto.ScheduleResponse;
import com.test.jpa.entity.User;
import com.test.jpa.repository.ScheduleRepository;
import com.test.jpa.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ScheduleServiceImpl implements ScheduleService {

    private final ScheduleRepository scheduleRepository;

    @Override
    public List<ScheduleResponse> scheduleList(String email) {
        return scheduleRepository.findByUser(User.builder()
                        .email(email)
                        .build())
                .stream()
                .map(schedule -> new ScheduleResponse(schedule))
                .collect(Collectors.toList());
    }

    @Override
    public String deleteSchedules(String id) {
        try {
            scheduleRepository.deleteById(Long.valueOf(id));
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }

    @Override
    public String insertSchedules(ScheduleRequest scheduleRequest) {
        try {
            scheduleRepository.save(scheduleRequest.toEntity());
        } catch (Exception e) {
            e.printStackTrace();
            return "failed";
        }
        return "success";
    }
}
