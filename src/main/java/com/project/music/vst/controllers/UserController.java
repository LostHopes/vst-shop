package com.project.music.vst.controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.music.vst.dto.Users;
import com.project.music.vst.repositories.UserRepository;

@RestController
@RequestMapping("/users")
public class UserController {
    private final UserRepository userRepository;

    @Autowired
    public UserController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping
    public ResponseEntity<List<Users>> getAllUsers() {
        List<Users> users = userRepository.findAll();
        return ResponseEntity.ok(users);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Users> getUser(@PathVariable("id") Long id) {
        Optional<Users> user = userRepository.findById(id);
        return ResponseEntity.ok(user.get());
    }

    @DeleteMapping("/{id}")
    public void deleteUserById(@PathVariable("id") Long id) {
        try {
            userRepository.deleteById(id);
        } catch (Exception e) {
            System.out.println("Error occurred after trying to delete user from the database: " + e.getMessage());
        }
    }

    @GetMapping("/count")
    public ResponseEntity<Long> getUsersCount(){
        return ResponseEntity.ok(userRepository.count());
    }
}
