package com.example.shop.member.service;

import com.example.shop.member.dto.Member;
import com.example.shop.member.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

    @Autowired
    MemberRepository mr;

    public int signup(Member member) {
        return mr.signup(member);
    }

}
