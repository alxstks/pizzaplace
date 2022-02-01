package com.alxstks.pizzaplace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @GetMapping("home")
    public String home() {
        return "home";
    }


}
