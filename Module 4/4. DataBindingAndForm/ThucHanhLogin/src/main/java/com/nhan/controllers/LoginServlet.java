package com.nhan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginServlet {
    @GetMapping(value = "/login")
    public String login(){
        return "login";
    }
}
