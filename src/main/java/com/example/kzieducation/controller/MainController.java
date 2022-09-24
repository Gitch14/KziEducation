package com.example.kzieducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String home(){
        return "index";
    }

      @GetMapping("/kabinet")
    public String kabinet(){
        return "kabinet";
    }

      @GetMapping("/adminPanel")
    public String adminPanel(){
        return "adminPanel";
    }
}