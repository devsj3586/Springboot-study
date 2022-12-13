package com.example.fintech.point.service;

import com.example.fintech.point.dto.PointDto;
import com.example.fintech.point.repository.PointRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PointService {

    @Autowired
    PointRepository pr;

    public int insertPoint (PointDto pointDto) {
        return pr.insertPoint(pointDto);
    }
}
