package ek.dk.countries.controllers;

import org.springframework.web.bind.annotation.*;

@RestController
public class WelcomeController {

    @GetMapping("/")
    public String welcome() {
        return "Welcome to the countries website!";
    }
}
