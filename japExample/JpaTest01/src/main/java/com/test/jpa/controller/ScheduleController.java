package com.test.jpa.controller;

import com.test.jpa.dto.ScheduleRequest;
import com.test.jpa.dto.ScheduleResponse;
import com.test.jpa.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpSession;
import java.util.List;

@RequiredArgsConstructor
@RestController
public class ScheduleController {

    private final ScheduleService scheduleService;

    @GetMapping("/schedules")
    public List<ScheduleResponse> scheduleList(HttpSession session) {
        String email = String.valueOf(session.getAttribute("email"));
        return scheduleService.scheduleList(email);
    }

    @DeleteMapping("/schedules/{id}")
    public String deleteSchedule(@PathVariable("id") String id) {
        return scheduleService.deleteSchedules(id);
    }

    @PostMapping("/schedules")
    public String insertSchedule (ScheduleRequest scheduleRequest, HttpSession session) {
        String email = String.valueOf(session.getAttribute("email"));
        scheduleRequest.setEmail(email);
        return scheduleService.insertSchedules(scheduleRequest);
    }
}
