package com.example.kzieducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {

    @GetMapping("/add-user")
    public String addUser(){
        return "addUserPAge";
    }
}