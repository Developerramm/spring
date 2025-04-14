package controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class RegisterController {

    @RequestMapping("/")
    public String index(){
        return "index";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/home")
    public String home(){
        return "home";
    }

    @RequestMapping(path = "/createUser",method = RequestMethod.POST)
    public String registerUser(){
        System.out.println("User created successfully");
        return "home";
    }


}
