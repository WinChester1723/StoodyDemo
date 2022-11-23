package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.Course;
import com.example.StoodyDemo.model.repository.CourseRepository;
import com.example.StoodyDemo.service.CourseService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/course")
@RequiredArgsConstructor
public class CourseTestController {
    @Autowired
    private final CourseService courseService;

    @PostMapping("/create")
    public Course create(@RequestBody Course course) {
        return courseService.create(course);
    }

//    @PostMapping("/tcreate")
//    public void test(){ Course course = new Course(); course.setName("Java");
//        List<String> t = new ArrayList<>();
//        Collections.addAll(t,"Test","Best","West");
//        course.setCourseTags(t);
//        course.setRating(500); courseRepository.save(course); }

    @GetMapping("/show-all")
    public List<Course> findAll() {
        return courseService.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<Course> findById(@PathVariable Long id) {
        return courseService.findById(id);
    }

    @PostMapping("/delete-course")
    public void deleteCategory(@RequestBody Course course) {
        courseService.delete(course);
    }

    @PostMapping("/delete-course/id/{id}")
    public void deleteById(@PathVariable Long id) {
        courseService.deleteById(id);
    }

}
