package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.CategoryDTO;
import com.example.StoodyDemo.model.entity.Category;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CategoryMapper {
    CategoryMapper INSTANCE = Mappers.getMapper(CategoryMapper.class);

    CategoryDTO entityToDTO(Category category);

    Category DTOToEntity(CategoryDTO categoryDTO);
}
