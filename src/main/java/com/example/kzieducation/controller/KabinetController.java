package com.example.kzieducation.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class KabinetController {

    @GetMapping("/kabinet")
      public String kabinet(){
        return "kabinet";
    }

    @GetMapping("/kabinet/attendance")
      public String attendance(){
        return "attendance";
    }

    @GetMapping("/kabinet/homeTask")
      public String homeTask(){
        return "homeTask";
    }

    @GetMapping("/kabinet/timetable")
      public String timetable(){
        return "timetable";
    }
}
