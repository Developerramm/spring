package com.injection.controller;

import com.injection.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
//    @Autowired
    private UserService userService;
    public HomeController(UserService userService){
        this.userService = userService;
    }

    @RequestMapping("/")
    public String home(){
        return "home";
    }

    @RequestMapping("/createUser")
    public String registerUser(){
       String msg = userService.saveUser();
        System.out.println(msg);
        return "success";
    }

}
