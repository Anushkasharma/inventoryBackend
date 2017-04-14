package com.inventory.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class user implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer userId;
    String name;
    String address;
    String phoneNumber;

    public user() {
    }

    public user(String name, String address, String phoneNumber) {
        this.name = name;
        this.address = address;
        this.phoneNumber = phoneNumber;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

}
