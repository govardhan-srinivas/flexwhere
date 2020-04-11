package com.dutchview.flexwhere.controller;

import java.util.List;

import com.dutchview.flexwhere.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dutchview.flexwhere.model.User;

import javax.validation.Valid;


@RestController
@RequestMapping("/api/v1")
@CrossOrigin(origins = "http://localhost:4200")
public class UserController {

    @Autowired
    private UserService service;

    @GetMapping(value = "/users")
    public ResponseEntity<List<User>> getAllUsers() {
        return service.getAllUsers();
    }

    @GetMapping(value = "/users/{id}")
    public ResponseEntity<User> findById(@PathVariable String id) {
        return service.findById(id);
    }

    @PostMapping(value = "/users")
    public ResponseEntity<User> createUser(@Valid @RequestBody User user) {
        return service.createUser(user);
    }

    @PutMapping(value = "/users/{id}")
    public ResponseEntity<User> updateUser(@PathVariable("id") String id, @Valid @RequestBody User user) {
        return service.updateUser(id, user);
    }

    @DeleteMapping(value = "/users/{id}")
    public ResponseEntity<HttpStatus> deleteUser(@PathVariable String id) {
        return service.deleteUser(id);
    }

    @DeleteMapping(value = "/users")
    public ResponseEntity<HttpStatus> deleteAllUsers() {
        return service.deleteAllUser();
    }

}
