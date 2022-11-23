package com.example.StoodyDemo.mapper;

import com.example.StoodyDemo.model.dto.CommentDTO;
import com.example.StoodyDemo.model.entity.Comment;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface CommentMapper {
        CommentMapper INSTANCE = Mappers.getMapper(CommentMapper.class);

        CommentDTO entityToDTO(Comment comment);

        Comment DTOToEntity(CommentDTO commentDTO);
}
