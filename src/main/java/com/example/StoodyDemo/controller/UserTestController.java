package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.User;
import com.example.StoodyDemo.model.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserTestController {
    private final UserRepository userRepository;

    @PostMapping("/create")
    public User create(@RequestBody User user){
        return userRepository.save(user);
    }

    @GetMapping("/show-all")
    public List<User> findAll(){
        return userRepository.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<User> findById(@PathVariable Long id){
        return userRepository.findById(id);
    }

    @DeleteMapping("/delete-user")
    public void deleteUser(@RequestBody User user){
        userRepository.delete(user);
    }

    @DeleteMapping("/delete-user/id/{id}")
    public void deleteById(@PathVariable Long id){
        userRepository.deleteById(id);
    }
}
