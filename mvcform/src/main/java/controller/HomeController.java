package controller;

import entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {
    @RequestMapping("/home")
    public String home(){
        return  "home";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping(path = "/createUser",method = RequestMethod.POST)
    public String registerUser(@ModelAttribute User user){
        System.out.println(user);
        System.out.println(user.getName());
        System.out.println(user.getEmail());
        System.out.println(user.getPassword());
        System.out.println("User created");
        return "home";
    }
}
