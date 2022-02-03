package com.alxstks.pizzaplace.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BuildController {

    @GetMapping("build")
    public String build() {

        return "build";
    }


}
