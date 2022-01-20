package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.repo.userrepo;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;


@RestController
public class usercontroller {
@Autowired
userrepo repo;


    @PostMapping("/user")
     public User saveuser(@RequestBody User user) {
       
         return  repo.save(user);

    }
    
}
