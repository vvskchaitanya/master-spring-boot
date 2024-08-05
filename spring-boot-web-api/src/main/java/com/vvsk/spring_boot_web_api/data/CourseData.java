package com.vvsk.spring_boot_web_api.data;

import java.util.ArrayList;
import java.util.List;

import com.vvsk.spring_boot_web_api.models.Course;

public class CourseData {

    public static List<Course> courses = new ArrayList<>();

    static {
        courses.add(new Course("Java Full Stack","JFS","V.V.S.K Chaitanya","3 Months",new String[]{"Core Java","Spring Boot","Angular","Microservices"}));
        courses.add(new Course("MEAN Stack","MEAN","V.V.S.K Chaitanya","3 Months",new String[]{"Mongo","Express JS","Angular","Node JS"}));
        courses.add(new Course("MERN Stack","MERN","V.V.S.K Chaitanya","3 Months",new String[]{"Mongo","Express JS","React","Node JS"}));
    }

}
