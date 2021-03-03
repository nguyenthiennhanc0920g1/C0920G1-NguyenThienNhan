package com.nhan.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class DictionaryController {
    @GetMapping("")
    public String home(){
        return "home";
    }
    @GetMapping("/home")
    public String translate(@RequestParam String eng, Model model){
        String vn = "";
        switch (eng){
            case "dog": vn = "chó";
            break;
            case "cat": vn = "mèo";
                break;
            case "bird": vn = "chim";
                break;
            case "pig": vn = "heo";
                break;
            case "chicken": vn = "gà";
                break;
            default: vn = "Không có";
        }
        model.addAttribute("vn", vn);
        return "home";
    }
}
