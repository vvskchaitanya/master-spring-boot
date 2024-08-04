package com.vvsk.fullstack.spring_boot_web_starter.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.vvsk.fullstack.spring_boot_web_starter.classes.Student;

@Controller
public class StudentsController {

    @RequestMapping("students")
    public String students(Model model){
        List<Student> students = new ArrayList<>();
        students.add(new Student("Chaitanya", "Fullstack", "Batch 1"));
        students.add(new Student("Rahul", "Meanstack", "Batch 2"));
        students.add(new Student("Keertana", "Cloud", "Batch 3"));
        students.add(new Student("David", "Devops", "Batch 4"));
        model.addAttribute("students", students);
        return "mypage";
    }

}
