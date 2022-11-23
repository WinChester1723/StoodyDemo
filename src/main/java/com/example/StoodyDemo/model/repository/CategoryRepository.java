package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.Category;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    @Override
    List<Category> findAll();

    @Override
    List<Category> findAllById(Iterable<Integer> integers);

    @Override
    Optional<Category> findById(Integer integer);

    @Override
    <S extends Category> S save(S entity);

    @Override
    void deleteById(Integer integer);


    @Override
    void delete(Category category);

    @Override
    <S extends Category> boolean exists(Example<S> example);

}
