package com.lineate.mongodb.controller;

import com.lineate.mongodb.domain.User;
import com.lineate.mongodb.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class UserController {
    private final UserRepository userRepository;

    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public List<User> getUsers() {
        return userRepository.findAll();
    }

    @GetMapping(value = "/add")
    public List<User> addUser() {
        User user = new User();
        user.setFirstName("first");
        user.setLastName("last");
        user.setPosition("pos");
        userRepository.save(user);
        return userRepository.findAll();
    }
}
