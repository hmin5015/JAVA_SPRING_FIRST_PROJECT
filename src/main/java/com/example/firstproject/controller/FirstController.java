package com.example.firstproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstController {

    @GetMapping("/hi")
    public String niceToMeetYou(Model model) {
        model.addAttribute("username", "ํ์ฐ");
        return "greetings"; // templates/greetings.mustache
    }

    @GetMapping("/bye")
    public String SeeYou(Model model) {
        model.addAttribute("nickname", "์กฐ์");
        return "goodbye";
    }
}
