package com.scheduleapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String index(){
        return"index";
    }

    @GetMapping("/login")
    public String login() {
        // Zwrócenie widoku książek (np. szablon Thymeleaf)
        return "login"; // To odpowiada plikowi books.html w src/main/resources/templates
    }

    @GetMapping("/register")
    public String register() {
        // Zwrócenie widoku książek (np. szablon Thymeleaf)
        return "register"; // To odpowiada plikowi books.html w src/main/resources/templates
    }
}
