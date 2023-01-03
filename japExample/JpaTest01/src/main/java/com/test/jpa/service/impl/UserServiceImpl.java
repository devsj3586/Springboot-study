package com.test.jpa.service.impl;

import com.test.jpa.dto.UserRequest;
import com.test.jpa.entity.User;
import com.test.jpa.repository.UserRepository;
import com.test.jpa.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;

    @Override
    public String insertUser(UserRequest userRequest) {
        try {
            userRepository.save(userRequest.toEntity());
        } catch (Exception e) {
            return "failed";
        }
        return "success";
    }

    @Override
    public String selectUser(UserRequest userRequest) {
        User user = userRepository.findByEmailAndPassword(userRequest.getEmail(), userRequest.getPassword())
                .orElse(null);
        if (user != null) {
            return "success";
        } else {
            return "failed";
        }
    }
}
