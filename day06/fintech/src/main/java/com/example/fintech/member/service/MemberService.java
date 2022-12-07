package com.example.fintech.member.service;

import com.example.fintech.member.dto.MemberDto;
import com.example.fintech.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int insertMember(MemberDto MemberDto) {
        return mr.insertMember(MemberDto);
    }

    public MemberDto loginMember(String email,String password) {
       return mr.loginMember(email, password);
    }
}
