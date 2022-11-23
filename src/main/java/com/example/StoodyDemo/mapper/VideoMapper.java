package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.VideoDTO;
import com.example.StoodyDemo.model.entity.Video;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface VideoMapper {
    VideoMapper INSTANCE = Mappers.getMapper(VideoMapper.class);

    VideoDTO entityToDTO(Video video);

    Video DTOToEntity(VideoDTO videoDTO);
}
