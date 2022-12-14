package com.example.StoodyDemo.model.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "stoody", name = "comments")
public class Comment {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //ManyToMany -?
//    TODO: OrkhanGG - need fixed / now this code worked
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(schema = "stoody", name = "comment_users",
            joinColumns = {@JoinColumn(name = "comment_id", referencedColumnName = "id")},
            inverseJoinColumns ={@JoinColumn(name = "author_id",referencedColumnName = "id")})
    private List<User> author;//need use List<>

    private String text;
    @Column(name = "post_date")
    private LocalDateTime postDate;
    private int like;
    @Column(name = "dis_like")
    private int disLike;
    //    ????? TODO: OrkhanGG - need fixed
//    private List<Comment> replies;
}
