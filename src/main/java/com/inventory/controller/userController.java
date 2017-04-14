package com.inventory.controller;

import com.inventory.entity.user;
import com.inventory.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {

    @Autowired
    UserService userService;

    @GetMapping("/user")
    public List<user> getAllUsers() {
        return userService.getAllUsers();
    }

}
