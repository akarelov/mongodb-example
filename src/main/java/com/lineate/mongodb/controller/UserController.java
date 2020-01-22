package com.lineate.mongodb.controller;

import com.lineate.mongodb.domain.User;
import com.lineate.mongodb.repository.UserRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
    public List<User> addUser(@RequestParam(value = "first") String firstName,
                              @RequestParam(value = "last") String lastName,
                              @RequestParam(value = "pos") String position) {
        User user = new User();
        user.setFirstName(firstName);
        user.setLastName(lastName);
        user.setPosition(position);
        userRepository.save(user);
        return userRepository.findAll();
    }

    @GetMapping(value = "/first")
    public List<User> getUserByFirstName(@RequestParam(value = "first") String firstName) {
        return userRepository.findByFirstName(firstName);
    }

    @GetMapping(value = "/last")
    public List<User> getUserByLastName(@RequestParam(value = "first") String lastName) {
        return userRepository.findByLastName(lastName);
    }

    @GetMapping(value = "/position")
    public List<User> getUserByPosition(@RequestParam(value = "position") String position) {
        return userRepository.findByPosition(position);
    }

    @GetMapping(value = "/remove")
    public List<User> removeUsers() {
        userRepository.deleteAll();
        return userRepository.findAll();
    }
}
