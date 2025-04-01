package com.scheduleapp;

import com.scheduleapp.services.KierunkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class MainController {

    @GetMapping("/")
    public String index() {
        return "index";
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

    @GetMapping("/schedule")
    public String schedule() {
        // Zwrócenie widoku książek (np. szablon Thymeleaf)
        return "schedule"; // To odpowiada plikowi books.html w src/main/resources/templates
    }

    @Autowired
    private KierunkiService kierunkiService;

    @GetMapping("/kierunki")
    public String getKierunki(Model model) {
        model.addAttribute("kierunki", kierunkiService.getAllKierunki());
        return "kierunki";  // Nazwa szablonu HTML
    }
}
