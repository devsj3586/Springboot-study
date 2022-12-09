package com.example.fintech.mapper;

import com.example.fintech.contact.dto.ContactDto;
import com.example.fintech.contact.dto.SubscribeDto;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface ContactMapper {

    int insertContact (ContactDto contactDto);
    int insertSubscribe(SubscribeDto subscribeDto);

}
