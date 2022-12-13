package com.example.fintech.mapper;

import com.example.fintech.point.dto.PointDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PointMapper {
    int insertPoint (PointDto pointDto);
}
