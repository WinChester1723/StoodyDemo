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
@Table(schema = "stoody", name = "privacy_settings")
public class PrivacySettings {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @Column(name = "show_profile_only_logged_users")
    private boolean showProfileOnlyLoggedUsers;
    @Column(name = "show_owned_courses_only_logged_users")
    private boolean showOwnedCoursesOnlyLoggedUsers;

    @OneToMany(mappedBy = "privacySettings")
    private List<User> users;

}
