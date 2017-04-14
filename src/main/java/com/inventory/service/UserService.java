package com.inventory.service;

import com.inventory.entity.user;
import com.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class UserService {

    @Autowired
    UserRepository userRepository;

    public List<user> getAllUsers() {
        return userRepository.findAll();
    }

    public List<user> getUsersByName(String name) {
        return userRepository.findByName(name);
    }
}
