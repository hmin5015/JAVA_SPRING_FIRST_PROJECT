package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "현우");
        return "greetings"; // templates/greetings.mustache
    }

    @GetMapping("/bye")
    public String SeeYou(Model model) {
        model.addAttribute("nickname", "조셉");
        return "goodbye";
    }
}
