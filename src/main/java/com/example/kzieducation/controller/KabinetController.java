package com.example.kzieducation.controller;


import com.example.kzieducation.model.Task;
import com.example.kzieducation.repo.TaskRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KabinetController {

    private final TaskRepository taskRepository;

    public KabinetController(TaskRepository taskRepository) {
        this.taskRepository = taskRepository;
    }

    @GetMapping("/kabinet")
      public String kabinet(){
        return "kabinet";
    }

    @GetMapping("/kabinet/attendance")
      public String attendance(){
        return "attendance";
    }

    @GetMapping("/kabinet/homeTask")
      public String homeTask(Model model){
        Iterable<Task> tasks = taskRepository.findAll();
        model.addAttribute("homeTask", tasks);
        return "homeTask";
    }

    @GetMapping("/kabinet/timetable")
      public String timetable(){
        return "timetable";
    }
}
