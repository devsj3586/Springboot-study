package com.cafe.admin.repository;

import com.cafe.admin.entity.Admin;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface AdminRepository extends JpaRepository<Admin, String> {

    List<Admin> findByIdAndPassword(String id, String password);
}
