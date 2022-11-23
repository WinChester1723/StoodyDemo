package com.example.StoodyDemo.service;

import com.example.StoodyDemo.model.entity.User;
import com.example.StoodyDemo.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class UserService {

    private final UserRepository userRepository;

    public List<User> findAll(){
        return userRepository.findAll();
    }

    public List<User> findAllById(Iterable<Long> longs){
        return userRepository.findAllById(longs);
    }

    public Optional<User> findById(Long l){
        return userRepository.findById(l);
    }

    public User create(User user){
        return userRepository.save(user);
    }

    public void deleteById(Long l){
        userRepository.deleteById(l);
    }

    public void delete(User user){
        userRepository.delete(user);
    }
}
