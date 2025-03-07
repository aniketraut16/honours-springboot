package com.example.demo.services;
import com.example.demo.db.UserInfo;
import org.springframework.stereotype.Service;

import  java.util.*;
@Service
public class UserServices {
    public List<String> getAllUsers(){
        return  List.of("A","B");
    }
    public String createUser(){
        System.out.println("User Created!!");
        return  "User Created!!";

    };

}
