package com.nhan.controller;

import com.nhan.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("/")
    public String home() {
        return "index";
    }

    @GetMapping("/register")
    public String register(ModelAndView modelAndView, User user) {
        modelAndView.addObject("user", user);
        return "register";
    }

    @PostMapping("/send")
    public String sendRegisterForm(@Valid @ModelAttribute("user") User user,
                                   BindingResult bindingResult, Model model) {
        if (bindingResult.hasFieldErrors()) {
            return "register";
        } else {
            model.addAttribute("user", user);
            return "result";
        }
    }
}
