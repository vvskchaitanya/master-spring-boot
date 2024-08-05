package com.vvsk.spring_boot_web_api.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.vvsk.spring_boot_web_api.data.CourseData;
import com.vvsk.spring_boot_web_api.models.Course;

@Service
public class CoursesService {

    public List<Course> get(){
        return CourseData.courses;
    }

    public void set(List<Course> courses){
        CourseData.courses = courses;
    }

}
