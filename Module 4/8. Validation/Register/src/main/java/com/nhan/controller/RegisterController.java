package com.nhan.controller;

import com.nhan.model.Register;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.validation.BindingResult;
import org.springframework.web.servlet.ModelAndView;

import javax.validation.Valid;

@Controller
public class RegisterController {
    @GetMapping("/")
    public ModelAndView showForm() {
        ModelAndView modelAndView = new ModelAndView("home");
        modelAndView.addObject("register", new Register());
        return modelAndView;
    }

//    @PostMapping("/validate")
//    public ModelAndView checkValidate(@Valid @ModelAttribute("register") Register register,
//                                      BindingResult bindingResult) {
//        if (bindingResult.hasFieldErrors()) {
//            return new ModelAndView("home");
//        }
//        return new ModelAndView("result");
//    }
    @PostMapping("/validate")
    public String checkValidation(@Valid @ModelAttribute("register") Register register,
                                  BindingResult bindingResult, Model model) {
        new Register().validate(register, bindingResult);
        if (bindingResult.hasFieldErrors()) {
            return "home";
        } else {
            model.addAttribute("register", register.getEmail());
            return "result";
        }
    }
}
