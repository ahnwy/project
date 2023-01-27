package com.example.project.service;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/hello2")
public class HelloServlet extends HttpServlet {
    public void init(ServletConfig config) throws ServletException {
        System.out.println("init() 실행됨!");
    }

    public void service(HttpServletRequest reqest, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("service() 실행됨!");
        System.out.println(reqest);
        response.getWriter().println("Hello World12134");
    }
}
