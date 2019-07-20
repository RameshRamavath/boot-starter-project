package com.spring.boot.service;

import com.spring.boot.service.dependencyInjection.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication

public class Application {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
        // after run method the Spring container will be created with all qualified Spring beans in it!

        System.out.println("checking for created objects ======>>"); // by default in Spring Objects are Singleton -- only once they will be created

        //System.out.println("Welcome to Spring boot learning");


        // normal way of creating objects
        //Person p1 = new Person();  // can some one do this for us?? -- we can use ConfigurableApplicationContext [run method returns this Object]


        Person p2 = context.getBean(Person.class);
        p2.sayHello();  // it will say NoSuchBeanDefinitionException: No qualifying bean of type 'Person' available

        // so how to make Person available here --> Spring has another container like JVM which holds all the Beans of application
        // Use @Component to make it as Spring Bean

        // by default Spring will create Object of all classes we mentioned as @Component and they will be created only Once


    }


}
