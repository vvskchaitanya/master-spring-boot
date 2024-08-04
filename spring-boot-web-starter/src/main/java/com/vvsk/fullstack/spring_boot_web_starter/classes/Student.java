package com.vvsk.fullstack.spring_boot_web_starter.classes;

public class Student {

    private String name;

    private String course;

    private String batch;

    public Student(String name, String course, String batch) {
        this.name = name;
        this.course = course;
        this.batch = batch;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getBatch() {
        return batch;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    
}
