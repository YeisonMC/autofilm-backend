package com.example.auto_film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/pages/direcciones")
public class direccionesController {
    @GetMapping("direccionesPage")
    public String getMethodName() {
        return "/pages/direcciones/direccionesPage";
    }
    
}
