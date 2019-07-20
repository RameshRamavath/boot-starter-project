package com.spring.boot.service.dependencyInjection;

// lets use this class object in Person class

import org.springframework.stereotype.Component;

@Component(value = "student1")
public class Student {

    private String name;
    private String place;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public void sayWelcome(){
        System.out.println("Welcome to class Students");
    }

    public Student(){
        super();
        System.out.println("Student object is created");
    }
}
