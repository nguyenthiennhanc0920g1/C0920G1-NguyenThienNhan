package com.nhan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CaculatorController {
    @GetMapping("")
    public String home() {
        return "home";
    }

    @GetMapping("/action")
    public String calculator(@RequestParam float num1,
                             @RequestParam float num2,
                             @RequestParam String act,
                             Model model) {
        float result = 0;
        switch (act) {
            case "Addition":
                result = num1 + num2;
                break;
            case "Subtraction":
                result = num1 - num2;
                break;
            case "Multiplication":
                result = num1 * num2;
                break;
            case "Division":
                result = num1 / num2;
                break;
        }
        model.addAttribute("result", result);
        return "home";
    }

}
