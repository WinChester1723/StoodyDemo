package com.example.StoodyDemo.model.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(schema = "stoody", name = "users")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    //    maybe unique
    @NonNull//TODO: OrkhanGG
    @Column(name = "user_name")
    private String userName;
    private String name;
    @Column(name = "sur_name")
    private String surName;
    @Column(name = "email", unique = true)
    private String email;
    private String password;

    //        @OneToMany()// TODO: OrkhanGG - this fields need create class / now this fileds are worked
    @ElementCollection
    @Column(name = "watch_history")
    private List<String> watchHistory;//need fix
    //    @OneToMany()
    @ElementCollection
    @Column(name = "wish_list")
    private List<String> wishlist;//need fix
    //    @OneToMany()
    @ElementCollection
    @Column(name = "watch_later")
    private List<String> watchLater;//need fix

    private String language;
    @Column(name = "profile_picture_url")
    private String profilePictureURL;

    //  ManyToOne
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "privacy_settings_id")
    private PrivacySettings privacySettings;

    //    ManyToOne
    @ManyToOne(cascade = CascadeType.MERGE, fetch = FetchType.LAZY)
    @JoinColumn(name = "contact_info_id")
    private ContactInfo contactInfo;

    //  ManyToMany
    @ManyToMany(cascade = CascadeType.MERGE, fetch = FetchType.EAGER)
    @JoinTable(schema = "stoody", name = "user_owned_courses",
            joinColumns = {@JoinColumn(name = "user_id", referencedColumnName = "id")},
            inverseJoinColumns = {@JoinColumn(name = "course_id", referencedColumnName = "id")})
    private List<Course> ownedCourses;

    @Column(name = "user_credits")
    private int userCredits;
}
