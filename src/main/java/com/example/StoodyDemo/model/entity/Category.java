package com.example.StoodyDemo.model.entity;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Data
@NoArgsConstructor
@Entity
@Table(schema = "stoody", name = "categories")
public class Category {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    @Column(name="category_id")
    private int id;

    @Column(name = "name")
    private String name;

    @OneToMany(mappedBy = "category")
    private List<Course> courses;
}
