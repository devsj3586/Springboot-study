package com.test.jpa.repository;

import com.test.jpa.entity.Schedule;
import com.test.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ScheduleRepository extends JpaRepository<Schedule, Long> {
    // Where  select 할때 스케줄 전부 가져오는게아니라 email별로 검색 해야함.
    List<Schedule> findByUser(User user);

}
