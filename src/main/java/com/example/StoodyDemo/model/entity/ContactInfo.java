package com.example.StoodyDemo.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "stoody", name = "contact_informations")
public class ContactInfo {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "contact_info_id")
    private Long id;

    private String website;
    private String email;
    private String linkedIn;
    private String facebook;
    private String twitter;
    private String instagram;
    private String youtube;

    @OneToMany(mappedBy = "contactInfo")
    private List<User> user;
}
