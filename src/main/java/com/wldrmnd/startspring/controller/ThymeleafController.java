package com.wldrmnd.startspring.controller;

import com.wldrmnd.startspring.entity.Student;
import com.wldrmnd.startspring.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;

@Controller
public class ThymeleafController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/greeting")
    public String greeting(
            @RequestParam(name="name", required=false, defaultValue="World") String name,
            Model model) {
        model.addAttribute("students", (ArrayList<Student>)studentService.getAll());
        return "greetings";
    }
}
