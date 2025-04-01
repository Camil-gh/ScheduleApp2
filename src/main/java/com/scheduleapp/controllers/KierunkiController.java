package com.scheduleapp.controllers;
import com.scheduleapp.services.KierunkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KierunkiController {

    /*@Autowired
    private KierunkiService kierunkiService;

    @GetMapping("/kierunki")
    public String getKierunki(Model model) {
        model.addAttribute("kierunki", kierunkiService.getAllKierunki());
        return "kierunki";  // Nazwa szablonu HTML
    }*/
}
