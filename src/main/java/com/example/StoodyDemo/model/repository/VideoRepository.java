package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.Video;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface VideoRepository extends JpaRepository<Video, Long> {
    @Override
    List<Video> findAll();

    @Override
    List<Video> findAllById(Iterable<Long> longs);

    @Override
    <S extends Video> S save(S entity);

    @Override
    Optional<Video> findById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(Video entity);

    @Override
    <S extends Video> boolean exists(Example<S> example);

}
