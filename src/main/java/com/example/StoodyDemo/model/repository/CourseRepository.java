package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.Course;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long> {
    @Override
    List<Course> findAll();

    @Override
    <S extends Course> S save(S entity);

    @Override
    Optional<Course> findById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Course entity);

    @Override
    <S extends Course> boolean exists(Example<S> example);
}
