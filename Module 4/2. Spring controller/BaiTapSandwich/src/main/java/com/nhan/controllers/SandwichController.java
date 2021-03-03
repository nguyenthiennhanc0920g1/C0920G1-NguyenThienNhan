package com.nhan.controllers;

import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestAttribute;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class SandwichController {
    @GetMapping(value = "/home")
    public String getHome() {
        return "home";
    }

    @PostMapping(value = "/save")
    public String show(@RequestParam(required = false) String[] giavi, Model model) {
        String giaVi = "";
        if (giavi != null) {
            for (String abc : giavi) {
                giaVi += abc + " ";
            }
        }
        else {
            giaVi = null;
        }
        model.addAttribute("giaVi",giaVi);
        return "show";
    }
}
