package com.example.shop.member.repository;

import com.example.shop.mapper.MemberMapper;
import com.example.shop.member.dto.Member;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class MemberRepository {

    @Autowired
    MemberMapper mapper;

    public int signup(Member member){
        return mapper.signup(member);
    }

    public Member login(Member member) {
        return mapper.login(member);
    }
}
