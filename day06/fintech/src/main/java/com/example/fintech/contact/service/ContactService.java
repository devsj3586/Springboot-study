package com.example.fintech.contact.service;

import com.example.fintech.contact.dto.ContactDto;
import com.example.fintech.contact.dto.SubscribeDto;
import com.example.fintech.contact.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepository cr;

    public  int insertContact (ContactDto contactDto) {
        return cr.insertContact(contactDto);
    }
    public int insertSubscribe(SubscribeDto subscribeDto){
        return cr.insertSubscribe(subscribeDto);
    }

}