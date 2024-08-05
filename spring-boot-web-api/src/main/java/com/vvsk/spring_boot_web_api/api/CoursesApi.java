package com.vvsk.spring_boot_web_api.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
/**
 * RestController Example for creating REST Web API
 */

import com.vvsk.spring_boot_web_api.models.Course;
import com.vvsk.spring_boot_web_api.service.CoursesService;

@RestController
public class CoursesApi {

    @Autowired
    CoursesService service;

    @GetMapping
    public List<Course> get(){
        return service.get();
    }

    @PostMapping
    public String post(@RequestBody List<Course> courses){
        service.set(courses);
        return "SUCCESS";
    }

}
