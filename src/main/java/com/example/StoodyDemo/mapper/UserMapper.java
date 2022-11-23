package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.UserDTO;
import com.example.StoodyDemo.model.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {
    UserMapper INSTANCE = Mappers.getMapper(UserMapper.class);

    UserDTO entityToDTO(User user);

    User DTOToEntity(UserDTO userDTO);
}
