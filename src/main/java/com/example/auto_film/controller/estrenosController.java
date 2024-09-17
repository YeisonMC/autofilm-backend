package com.example.auto_film.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
@RequestMapping("/pages/estrenos")
public class estrenosController {
    
    @GetMapping("/estrenosPage")
    public String mostrarPaginaEstrenos() {
       return "/pages/estrenos/estrenosPage";
    }

}
