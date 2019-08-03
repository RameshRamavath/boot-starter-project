package com.spring.boot.service.dependencyInjection;


import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

@EnableAspectJAutoProxy
@Aspect // this class is our Aspect class - We can keep all cross cutting concerns in this class
@Component // make this class as another component in Spring container

public class AOP {

    // let's log something before some methods we are calling in Person class
    // when to call this method


    // what && when should be called in Person class
    // Call log method - before each method execution --> join point

    @Before(value = "execution(public void sayHello())") // here the expression is called as point cut expression
    public void log(){
        System.out.println("Person is getting called");
    }
}
