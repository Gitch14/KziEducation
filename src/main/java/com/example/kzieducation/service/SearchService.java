package com.example.kzieducation.service;

import com.example.kzieducation.model.User;
import com.example.kzieducation.repo.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SearchService {

    @Autowired
    private UserRepository repo;

    public Iterable<User> listName(String keyword) {
        if (keyword != null) {
            return repo.search(keyword);
        }
        return (Iterable<User>) repo.findAll();
    }

}