package com.example.fintech.contact.controller;

import com.example.fintech.contact.dto.ContactDto;
import com.example.fintech.contact.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class ContactController {

    @Autowired
    ContactService cs;

    @PostMapping("/requestCall")
    public String requestCall (ContactDto contactDto) {
        cs.insertContact(contactDto);
        return "redirect:/";
    }
}
