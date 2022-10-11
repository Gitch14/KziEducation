package com.example.kzieducation.controller;

import com.example.kzieducation.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AdminController {



    @GetMapping("/admin/add-user")
    public String addUser(){
        return "addUser";
    }

    @PostMapping("/admin/add-user")
    public String methodPostAddUser(@RequestParam String surname,@RequestParam String name,@RequestParam String group,@RequestParam String role,@RequestParam String pass){
        User user = new User(surname,name,group,role,pass);
        userRepository.save(user);
        return "addUser";
    }

}