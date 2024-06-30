package com.groupc.indv.utils;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.groupc.indv.dto.ContactsDTO;
import com.groupc.indv.model.Contacts;

@Mapper
public interface ContactsMapper {
    ContactsMapper INSTANCE = Mappers.getMapper(ContactsMapper.class);

    Contacts toModel(ContactsDTO dto);
    ContactsDTO toDTO(Contacts model);
}
