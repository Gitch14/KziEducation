package com.example.kzieducation.controller;

import com.example.kzieducation.model.User;
import com.example.kzieducation.repo.UserRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class AdminController {

    private final UserRepository userRepository;

    public AdminController(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @GetMapping("/admin/add-user")
    public String addUser(){
        return "addUser";
    }

    @PostMapping("/admin/add-user")
    public String methodPostAddUser(@RequestParam String surname, @RequestParam String name, @RequestParam String group, @RequestParam String role, @RequestParam String pass, Model model){
        User user = new User(surname,name,group,role,pass);
        userRepository.save(user);
         return "redirect:/";
    }

}