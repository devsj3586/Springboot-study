package com.example.fintech.contact.repository;

import com.example.fintech.contact.dto.ContactDto;
import com.example.fintech.contact.dto.SubscribeDto;
import com.example.fintech.mapper.ContactMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class ContactRepository {
    @Autowired
    ContactMapper mapper;

    public  int insertContact (ContactDto contactDto) {
        return mapper.insertContact(contactDto);
    }

    public int insertSubscribe(SubscribeDto subscribeDto){
        return mapper.insertSubscribe(subscribeDto);
    }
}