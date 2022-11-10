package com.example.kzieducation.controller;

import com.example.kzieducation.model.Task;
import com.example.kzieducation.repo.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TeacherController {

    private final TaskRepository taskRepository;

    public TeacherController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/teacher")
    public String teacher(){
        return "TeacherPage";
    }

    @GetMapping("/teacher/AddHomeTask")
      public String homeTask(){
        return "addTask";
    }

    @PostMapping("/teacher/AddHomeTask")
    public String AddhomeTask(@RequestParam String lesson, @RequestParam String homeTask){
        Task task = new Task(lesson,homeTask);
        taskRepository.save(task);
         return "redirect:/kabinet/homeTask";
    }
}
