package com.example.StoodyDemo.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "stoody", name = "privacy_settings")
public class PrivacySettings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "privacy_settings_id")
    private int id;

    @Column(name = "show_profile_only_logged_users")
    private boolean showProfileOnlyLoggedUsers;
    @Column(name = "show_owned_courses_only_logged_users")
    private boolean showOwnedCoursesOnlyLoggedUsers;

    @OneToMany(mappedBy = "privacySettings")
    private List<User> users;

}
