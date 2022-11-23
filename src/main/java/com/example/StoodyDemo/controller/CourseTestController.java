package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Course;
import com.example.StoodyDemo.model.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseTestController {

    @Autowired
    private final CourseRepository courseRepository;

    @PostMapping("/create")
    public Course create(@RequestBody Course course){
        return courseRepository.save(course);
    }

//    @PostMapping("/tcreate")
//    public void test(){ Course course = new Course(); course.setName("Java");
//        List<String> t = new ArrayList<>();
//        Collections.addAll(t,"Test","Best","West");
//        course.setCourseTags(t);
//        course.setRating(500); courseRepository.save(course); }

    @GetMapping("/show-all")
    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<Course> findById(@PathVariable Long id){
        return courseRepository.findById(id);
    }

    @DeleteMapping("/delete-course")
    public void deleteCategory(@RequestBody Course course){
        courseRepository.delete(course);
    }

    @DeleteMapping("/delete-course/id/{id}")
    public void deleteById(@PathVariable Long id){
        courseRepository.deleteById(id);
    }

}
