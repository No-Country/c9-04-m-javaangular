package com.example.happypawsbackend.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    @GetMapping("/home")
    public String Home() {
        return "Welcome to the homepage";
    }

    @PostMapping("/crear-cita")
    public String Consulta() {
        return "Nueva consulta creada";
    }
}
