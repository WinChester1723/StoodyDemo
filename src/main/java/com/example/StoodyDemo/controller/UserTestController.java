package com.example.StoodyDemo.controller;

import com.example.StoodyDemo.model.entity.User;
import com.example.StoodyDemo.model.repository.UserRepository;
import com.example.StoodyDemo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserTestController {
    @Autowired
    private final UserService userService;

    @PostMapping("/create")
    public User create(@RequestBody User user) {
        return userService.create(user);
    }

    @GetMapping("/show-all")
    public List<User> findAll() {
        return userService.findAll();
    }

    @GetMapping("/show-all/id/{id}")
    public Optional<User> findById(@PathVariable Long id) {
        return userService.findById(id);
    }

    @PostMapping("/delete-user")
    public void deleteUser(@RequestBody User user) {
        userService.delete(user);
    }

    @PostMapping("/delete-user/id/{id}")
    public void deleteById(@PathVariable Long id) {
        userService.deleteById(id);
    }
}
