package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.CourseDTO;
import com.example.StoodyDemo.model.entity.Course;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CourseMapper {
    CourseMapper INSTANCE = Mappers.getMapper(CourseMapper.class);

    CourseDTO entityDTO(Course course);

    Course DTOToEntity(CourseDTO courseDTO);
}
