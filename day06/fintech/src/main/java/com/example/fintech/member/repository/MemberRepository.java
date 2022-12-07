package com.example.fintech.member.repository;

import com.example.fintech.mapper.MemberMapper;
import com.example.fintech.member.dto.MemberDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int insertMember(MemberDto MemberDto) {
       return mapper.insertMember(MemberDto);
    }

    public MemberDto loginMember(String email,String password) {
       return mapper.loginMember(email, password);
    }
}
