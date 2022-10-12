package com.example.kzieducation.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class NewsController {

    @GetMapping("/admin/add-news")
    public String addNews(){
        return "addNews";
    }

}