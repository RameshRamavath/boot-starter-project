##      What is DependencyInjection 


   **In large application one need to fallow some design pattern -- One such thing is Dependency Injection**
       
###What is it? and Why need?

       In Object oriented programming we create many Objects to achieve final result & there will be cases where One Object is dependent
       on Other Object -- Dependency Graph

       Building Laptop Application
       
       public class laptop {

       // inside classes we create our Objects

       HardDrive obj1;
       Ram obj2;

       Using Objects -- new keyword for making instance of any object

       HitachiHD obj1 = new HitachiHd(); -- 
   
   *to make objects loosely coupled we can use abstraction or Interfaces*

        create interface of HardDrive and extend it to any type of Hardware
        
        public interface HardDrive {
          ----
          ----
        }

        HardDrive obj1 = new HitachiHd();
        HardDrive obj2 = new SamsungHd(); --> but still we are hard coding it saying I need object type of Hitachi

        so instead of we hard coding it would be great if someone Inject HardDrive Object to Laptop class [Laptop is dependent on Hard drive]

        So we have -- Dependency Injection Containers [Spring Containers]

 **Spring containers will be creating all objects and Inject into our application class**

        Where to mention and how to say to inject --> we need to do some config's here

        @Component annotation makes them a component of spring framework which will be generated as per requirement

        @Component
        class HitachiHD implements HardDrive{
        // business logic
        }

        // so these objects are readily available from Spring containers when ever some one asks fro them

 **How to access objects from Spring container ==> @Autowired on top of our object**

        @Autowired
        HardDrive obj1;

        so spring boot understands that Laptop class need HardDrive object and I have a component of HardDrive in my container --> So lets connect them

        and this how dependency injection is achieved!
