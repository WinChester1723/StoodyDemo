package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.PrivacySettingsDTO;
import com.example.StoodyDemo.model.entity.PrivacySettings;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface PrivacySettingsMapper {
    PrivacySettingsMapper INSTANCE = Mappers.getMapper(PrivacySettingsMapper.class);

    PrivacySettingsDTO entityToDTO(PrivacySettings privacySettings);

    PrivacySettings DTOToEntity(PrivacySettingsDTO privacySettingsDTO);
}
