package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.ContactInfoDTO;
import com.example.StoodyDemo.model.entity.ContactInfo;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface ContactInfoMapper {
    ContactInfoMapper INSTANCE = Mappers.getMapper(ContactInfoMapper.class);

    ContactInfoDTO entityToDTO(ContactInfo contactInfo);

    ContactInfo DTOToEntity(ContactInfoDTO contactInfoDTO);
}
