package com.nhandeptrai.demo_buoi5.Services;


import com.nhandeptrai.demo_buoi5.Entities.User;
import com.nhandeptrai.demo_buoi5.RequestEntities.UserCreate;
import com.nhandeptrai.demo_buoi5.Responsitories.UserResponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@Service
public class UserServices {
    @Autowired
    private UserResponsitory userResponsitory;
    public List<User> getAllUser(){
        return userResponsitory.findAll();
    }
    public User createUser(UserCreate userCreate){
        try{
            User user = new User();
            user.setUserName(userCreate.getUserName());
            user.setFirstName(userCreate.getFirstName());
            user.setLastName(userCreate.getLastName());
            user.setEmail(userCreate.getEmail());
            user.setPassword(userCreate.getPassword());
            DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
            user.setDateOfBirth(dateFormat.parse(userCreate.getDateOfBirth()));
            user.setRole(userCreate.getRole());
            userResponsitory.save(user);
            return user;
        }catch (Exception e){
            throw  new RuntimeException(e.getMessage());
        }
    }
}
