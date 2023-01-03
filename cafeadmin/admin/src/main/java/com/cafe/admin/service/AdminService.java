package com.cafe.admin.service;

import com.cafe.admin.dto.AdminReqDTO;
import com.cafe.admin.dto.AdminResDTO;
import com.cafe.admin.entity.Admin;
import com.cafe.admin.repository.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdminService {
    @Autowired
    AdminRepository ar;


}
