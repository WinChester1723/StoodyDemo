package com.example.StoodyDemo.model.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CourseDTO {

    private String name;
    private String description;
    private int viewCount;
    private int likeCount;
    private int dislikeCount;
    private int wishListedCount;
    private String ribbonText;
    private int rating;
}
