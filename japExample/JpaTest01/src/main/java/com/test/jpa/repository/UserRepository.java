package com.test.jpa.repository;

import com.test.jpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, String> {

    // WHERE 절
    // Optional 널체크 .
    Optional<User> findByEmailAndPassword(String email, String password);
}
