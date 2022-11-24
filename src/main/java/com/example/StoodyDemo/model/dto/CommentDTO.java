package com.example.StoodyDemo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CommentDTO {

    private String text;
    private LocalDateTime postDate;
    private int like;
    private int disLike;
}
