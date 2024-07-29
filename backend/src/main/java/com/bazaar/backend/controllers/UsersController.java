package com.bazaar.backend.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import com.bazaar.backend.models.User;
import com.bazaar.backend.repositories.UsersRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PostMapping;



@RestController
@RequestMapping("/users")
public class UsersController {
    @Autowired
    private UsersRepository repository;

    @GetMapping("/allUsers")
    public Iterable<User> getAllUsers() {
        return this.repository.findAll();
    }
    
    @GetMapping("/create")
    public String createUser(@RequestBody String param) {
        return new String();
    }
    

    @PostMapping("/user-profiles")
    public ResponseEntity<String> create(@RequestBody User user) {
        //custom process
        return new ResponseEntity<>("created", HttpStatus.CREATED);
    }
    
}
