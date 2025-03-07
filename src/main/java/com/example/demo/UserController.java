package com.example.demo;

import com.example.demo.services.UserServices;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    UserServices userServices;
    @GetMapping("/")
    List<String> getAllUsers(){
        return  userServices.getAllUsers();
    }
    @PostMapping("/")
    String createUser(){
        return userServices.createUser();
    }

}
