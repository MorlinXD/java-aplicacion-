package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {

    @GetMapping("/")
    public String home(Model model) {
        model.addAttribute("titulo", "Mi App Demo");
        model.addAttribute("subtitulo", "Spring Boot sin base de datos");
        return "index";
    }
}
