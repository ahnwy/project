package com.example.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {
    @RequestMapping("/")
    public String helloWorld(){
        System.out.println("11111111111");
        return "/views/index.jsp";
    }
}
