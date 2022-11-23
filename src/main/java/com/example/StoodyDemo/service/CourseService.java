package com.example.StoodyDemo.service;

import com.example.StoodyDemo.model.entity.Course;
import com.example.StoodyDemo.model.repository.CourseRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class CourseService {

    private final CourseRepository courseRepository;

    public List<Course> findAll(){
        return courseRepository.findAll();
    }

    public Optional<Course> findById(Long l){
        return courseRepository.findById(l);
    }

    public Course create(Course course){
        return courseRepository.save(course);
    }

    public void deleteById(Long l){
        courseRepository.deleteById(l);
    }

    public void delete(Course course){
        courseRepository.delete(course);
    }
}
