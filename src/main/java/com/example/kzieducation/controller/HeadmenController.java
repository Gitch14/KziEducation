package com.example.kzieducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HeadmenController {

    @GetMapping("/headmen")
    public String headmen(){
        return "Headmen";
    }
}
