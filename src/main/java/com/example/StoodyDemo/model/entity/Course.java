package com.example.StoodyDemo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "stoody", name = "courses")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private String name;
    private String description;

    //    ManyToMany
//    TODO: OrkhanGG - need fixed / now this code worked
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(schema = "stoody", name = "course_authors",
            joinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "author_id", referencedColumnName = "id")})
    private List<User> author;//maybe Set<>

    //    OneToMany
    @OneToMany(mappedBy = "course")
    private List<Video> video;

    //    ManyToMany
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(schema = "stoody", name = "course_comments",
            joinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "comment_id", referencedColumnName = "id")})
    private List<Comment> comments;

    @Column(name = "view_count")
    private int viewCount;
    @Column(name = "like_count")
    private int likeCount;
    @Column(name = "dis_like_count")
    private int dislikeCount;
    @Column(name = "wish_listed_count")
    private int wishListedCount;

    //    ManyToOne
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "category_id")
    private Category category;

    @Column(name = "ribbon_text")
    private String ribbonText;

//    @ElementCollection
//    private List<String> courseTags;//TODO: OrkhanGG - need fix

    private int rating;
}
