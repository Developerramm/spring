package controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HomeController {

    @RequestMapping("/")
    public ModelAndView getPage(){
        ModelAndView m = new ModelAndView();
        m.setViewName("index");
        return m;
    }

    @RequestMapping("/home")
    public String home(Model m){
        m.addAttribute("name","Ram Kumar");
        return "home";
    }

    @RequestMapping("/login")
    public ModelAndView login(){

        ModelAndView m = new ModelAndView();
        m.addObject("city","Maniyari");
        m.addObject("key","Chabhi");
        m.setViewName("login");
        return m;
    }


}
