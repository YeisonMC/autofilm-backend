package com.example.auto_film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequestMapping("/pages/cartelera")
public class carteleraController {
    
    @GetMapping("/carteleraPage")
    public String getMethodName() {
        return "/pages/cartelera/carteleraPage";
    }
    
}
