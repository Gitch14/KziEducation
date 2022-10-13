package com.example.kzieducation.repo;

import com.example.kzieducation.model.News;
import com.example.kzieducation.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NewsRepository extends JpaRepository<News, Integer> {
}