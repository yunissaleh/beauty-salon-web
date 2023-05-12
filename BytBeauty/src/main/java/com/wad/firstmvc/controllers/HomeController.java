package com.wad.firstmvc.controllers;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class HomeController {

    @GetMapping
    public String home(){
        //returns the view
        return "index";

    }

    @GetMapping("/team")
    public String team(){
        //returns the view
        return "team";

    }

    @GetMapping("/contact")
    public String contact(){
        //returns the view
        return "contact";

    }
}
