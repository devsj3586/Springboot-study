package com.test.jpa.service;

import com.test.jpa.dto.UserRequest;

public interface UserService {

    // 유저 등록
    String insertUser(UserRequest userRequest);

    // 로그인
    String selectUser(UserRequest userRequest);
}
