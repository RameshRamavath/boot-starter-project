package com.spring.boot.service.dependencyInjection;


/*
     Spring AutoWire
     ------------------

     Spring container ==> contains diff objects which we call as Spring Beans

     how and when these Spring Beans gets created?
     -----------------------------------------------
     In two diff scopes we create Spring Beans
     1. Singleton
     2. ProtoType

     How to create these beans? -- we may not require to create beans for all the classes in our application - So lets take that control with developed

     Use @Component ---> with this it will create Spring bean/ object of person class in spring container

     by default objects created here are Singleton and created when the application gets started

     To make them created when required, we can make them ProtoType using @Scope annotation


 */

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
// @Scope(value = "prototype")   // with these Object will be created only when we say getBeans(Person.class)
public class Person {

    private String name;
    private String place;

    // create variable of Student class

    @Autowired
    @Qualifier("student1")
    private Student student;

    public Student getStudent() {

        return student;
    }

    public void setStudent(Student student) {

        this.student = student;
    }


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

    public void sayHello() {

        System.out.println("Hey Man :)");

        student.sayWelcome();

        // the moment this line executed will be getting NullPointerException because we haven't created any object of Student
        // let's use @Component to automatically create Object for Student --> but still same error

        // though we have Both Student & Person objects/beans in Spring container it's not able to refer it

        // We need to Autowire Student Object/Bean here
    }

    public Person() {
        super();
        System.out.println("Person object is created");
    }
}
