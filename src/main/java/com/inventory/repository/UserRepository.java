package com.inventory.repository;

import com.inventory.entity.user;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface UserRepository extends JpaRepository<user, Integer>{

    List<user> findByName(String name);

}
