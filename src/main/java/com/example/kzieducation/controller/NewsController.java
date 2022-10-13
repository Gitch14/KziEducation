package com.example.kzieducation.controller;

import com.example.kzieducation.model.News;
import com.example.kzieducation.repo.NewsRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class NewsController {


    private final NewsRepository newsRepository;

    public NewsController(NewsRepository newsRepository) {
        this.newsRepository = newsRepository;
    }

    @GetMapping("/")
    public String home(Model model){
        Iterable<News> news = newsRepository.findAll();
        model.addAttribute("news", news);
        return "index";
    }

    @GetMapping("/admin/add-news")
    public String addNews(){
        return "addNews";
    }

      @PostMapping("/admin/add-news")
    public String methodPostAddUser(@RequestParam String title, @RequestParam String description,@RequestParam String text){
        News news = new News(title,description,text);
        newsRepository.save(news);
         return "redirect:/";
    }
}