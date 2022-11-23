package com.example.StoodyDemo.model.repository;

import com.example.StoodyDemo.model.entity.User;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Override
    List<User> findAll();

    @Override
    List<User> findAllById(Iterable<Long> longs);

    @Override
    <S extends User> S save(S entity);

    @Override
    Optional<User> findById(Long aLong);

    @Override
    boolean existsById(Long aLong);

    @Override
    void deleteById(Long aLong);

    @Override
    void delete(User entity);

    @Override
    <S extends User> Page<S> findAll(Example<S> example, Pageable pageable);//nado uznat kak rabotaet

    @Override
    <S extends User> boolean exists(Example<S> example);

}
