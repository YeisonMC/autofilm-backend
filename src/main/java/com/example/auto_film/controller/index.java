package com.example.auto_film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class index {
    @GetMapping({"/", "index", "home"})
    public String home() {
        return "index";
    }
    
}
