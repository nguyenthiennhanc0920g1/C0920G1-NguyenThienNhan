package com.nhan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class MoneyController {
    @GetMapping("/home")
    public String changeMoney(@RequestParam float vnd, Model model){
        float usd = vnd/22000;
        model.addAttribute("usd", usd);
        return "home";
    }
    @GetMapping("/")
    public String home(){
        return "home";
    }
}
