package com.example.fintech.mapper;

import com.example.fintech.member.dto.MemberDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface MemberMapper {

    int insertMember(MemberDto MemberDto);

     MemberDto loginMember(String email,String password);

}
