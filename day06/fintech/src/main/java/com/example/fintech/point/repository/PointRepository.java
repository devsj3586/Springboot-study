package com.example.fintech.point.repository;

import com.example.fintech.mapper.PointMapper;
import com.example.fintech.point.dto.PointDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class PointRepository {

    @Autowired
    PointMapper mapper;

    public int insertPoint(PointDto pointDto) {
        return mapper.insertPoint(pointDto);
    }

}
