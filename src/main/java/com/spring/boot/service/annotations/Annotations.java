package com.spring.boot.service.annotations;

public class Annotations {

    /*

       Dependency injection related:
       =================================

       1. @Component --> to create Spring bean or Objects in Spring container - Singleton objects will be created once Application.run method gets executed
       2. @Scope     --> to make it ProtoType :: create Object once we call specific class object
       3. @Autowire  --> to inject one class bean into another :: Person object needs Student Object and with Auto wire Spring will search for Student object in Spring container
       4. @Qualifier --> to search Objects by names in spring container


     */
}
