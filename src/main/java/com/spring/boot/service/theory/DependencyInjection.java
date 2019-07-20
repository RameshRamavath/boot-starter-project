package com.spring.boot.service.theory;

public class DependencyInjection {

    /*

       In large application one need to fallow some design pattern -- One such thing is Dependency Injection
       What [is it?] and Why [need?]
       ----------------------------------

       In Object oriented programming we create many Objects to achieve final result & there will be cases where One Object is dependent
       on Other Object -- Dependency Graph

       Building Laptop:
------------------------------------------
       public class laptop {

       // inside classes we create our Objects

       HardDrive obj1;
       Ram obj2;

        to use these objects we always invoke them by new keyword

        HitachiHD obj1 = new HitachiHd(); -- to make it loosely couple we can use abstraction or create Interface

        ---> create interface of HardDrive and extend it to any type of Hardware

        HardDrive obj1 = new HitachiHd();
        HardDrive obj2 = new SamsungHd(); --> but still we are hard coding it saying I need object type of Hitachi

        so instead of we hard coding it would be great if someone Inject HardDrive Object to Laptop class [Laptop is dependent on Hard drive]

        So we have -- Dependency Injection Containers [Spring Containers]

        -- these containers will be creating those objects and Inject into our application class

        Where to mention and how to say to inject --> we need to do some config's here

        @Component annotation makes them a component of spring framework which will be generated as per requirement

        @Component
        class HitachiHD implements HardDrive{
        // business logic
        }

        // so these objects are readily available from Spring containers when ever some one asks fro them

        so how to access them in our Laptop class ---> @Autowired on top of our object

        @Autowired
        HardDrive obj1;

        so spring boot understands that Laptop class need HardDrive object and I have a component of HardDrive in my container --> So lets connect them

        and this how dependency injection is achieved!


       }


     */



}
