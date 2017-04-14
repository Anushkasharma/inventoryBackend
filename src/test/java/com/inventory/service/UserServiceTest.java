package com.inventory.service;

import com.inventory.entity.user;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

import static org.junit.Assert.*;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("default")
public class UserServiceTest {

    @Autowired
    UserService userService;

    @Test
    public void testGetUsersByName() {
        List<user> userList = userService.getUsersByName("ABC");

        assertEquals(1, userList.size());

    }

}