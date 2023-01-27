package com.example.project.controller;

import com.example.project.common.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.error.ErrorController;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sound.midi.Soundbank;

@Controller
public class ExecptController implements ErrorController {
    @Autowired
    private CustomProperties customProperties;

    @RequestMapping(value = "/error")
    public String handle(HttpServletRequest request, HttpServletResponse response){

        Object statusCode = request.getAttribute(RequestDispatcher.ERROR_STATUS_CODE);
        System.out.println("statusCode >>> " + statusCode);
        System.out.println(customProperties.getError404());
//        if(statusCode.toString().equals("")){
//            if(statusCode.toString().equals("404")){
//                return customProperties.getError404();
//            }
//        }
        return "/views/error/404";
    }

    @Override
    public String getErrorPath() {
        return "/error";
    }
}
