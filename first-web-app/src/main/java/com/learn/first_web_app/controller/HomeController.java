package com.learn.first_web_app.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController
{
    @RequestMapping("/")
    public String greet()
    {
        return "welcome to springboot";
    }

    @RequestMapping("/about")
    public String about()
    {
        return "lets learn what is spring";
    }


}
