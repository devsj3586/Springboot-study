package com.example.shop.mapper;

import com.example.shop.member.dto.Member;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int signup(Member member);

    Member login(Member member);

}
