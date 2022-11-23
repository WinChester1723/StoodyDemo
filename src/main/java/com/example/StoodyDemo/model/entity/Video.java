package com.example.StoodyDemo.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "stoody", name = "videos")
public class Video {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "video_id")
    private Long id;

    private String name;
    @Column(name = "url")
    private String URL;

    @ManyToOne(cascade = {CascadeType.MERGE, CascadeType.REFRESH,CascadeType.REMOVE},fetch = FetchType.LAZY)
    @JoinColumn(name = "course_id")
    private Course course;

}
