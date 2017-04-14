package com.inventory.config;

import com.inventory.entity.user;
import com.inventory.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

@Configuration
@ComponentScan
@Profile("default")
public class inventoryConfiguration {

    @Autowired
    UserRepository userRepository;

    @Bean
    @Primary
    public UserRepository setUserRepository() {
        List<user> userList = Arrays.asList(new user("ABC", "124 spring street NW Atlanta GA" , "124-244-5521") ,
                                            new user("DEF", "1264 10th street NE Orlando , FL" , "124-236-8784"),
                                            new user("GHK", "5 Embassy Rd , Dallas, TX" , "133-635-7843"));
        userList.forEach(userRepository :: save);
        return userRepository;
    }
}
