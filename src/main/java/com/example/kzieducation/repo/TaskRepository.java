package com.example.kzieducation.repo;

import com.example.kzieducation.model.Task;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TaskRepository extends JpaRepository<Task, Integer> {
}