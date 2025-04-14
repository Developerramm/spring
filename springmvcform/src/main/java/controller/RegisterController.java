package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

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
    public String registerUser(@ModelAttribute User user, @RequestParam("image") String fullName){
        System.out.println(user);
        System.out.println(fullName);
        System.out.println("User created successfully");
        return "home";
    }


}
