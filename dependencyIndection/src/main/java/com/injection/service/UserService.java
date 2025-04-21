package com.injection.service;

import com.injection.repository.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private UserDao userDao;

    public String saveUser(){

        boolean user = userDao.save();

        if(user){
            return "Register successful";
        }else{
            return "Registration failed";
        }
    }
}
