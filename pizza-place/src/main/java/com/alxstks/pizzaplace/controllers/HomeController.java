package com.alxstks.pizzaplace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class HomeController {

    @RequestMapping(method = {RequestMethod.GET, RequestMethod.POST})
    public String home(@RequestParam Model model){
        return "home";
    }


}
