package com.vvsk.spring_boot_web_api.models;

public class Course {

    private String name;

    private String code;

    private String instructor;

    private String duration;

    private String[] topics;

    public Course(String name, String code, String instructor, String duration, String[] topics) {
        this.name = name;
        this.code = code;
        this.instructor = instructor;
        this.duration = duration;
        this.topics = topics;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public String[] getTopics() {
        return topics;
    }

    public void setTopics(String[] topics) {
        this.topics = topics;
    }

    

}
