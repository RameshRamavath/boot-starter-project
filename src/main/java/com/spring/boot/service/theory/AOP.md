##  Aspect Oriented Programming in Spring

**Few cross cutting concerns at enterprise level**

1. Logging 
2. Security
3. transaction management
4. data validation etc


**Issue**

    Let's assume developer logging some information for debugging purpose in all the methods/classes of our application -> adding many/few lines of extra code other than business logic
    to avoid these info away from business logic --> we can create separate class to handle logging --> but we still need to 
    call this logging class in each method to achieve our end gold ==> Logging

*how we can avoid this separate call in each method*

**Spring AOP** takes out the direct dependency of crosscutting tasks from classes that we can’t achieve through normal object oriented programming model

### Core concepts of AOP

  1. **Aspect**
               
    A class that implements enterprise application concerns that cut across multiple classes
    we can use Spring AspectJ integration to define a class as Aspect using @Aspect annotation.
    
  2. **Join Point**
  
    join point is the specific point in the application such as method execution, exception handling, changing object variable values etc. 
    In Spring AOP a join points is always the execution of a method
    
  3. **Advice**
  
    Advices are actions taken for a particular join point
    
  4. **Pointcut** 
  
    Pointcut are expressions that is matched with join points to determine whether advice needs to be executed or not. Pointcut uses different kinds of expressions that are matched with the join points and Spring framework uses the AspectJ pointcut expression language.
    
### AOP Advice Types

  1. Before
  2. After
  
  3. After Returning
  4. After Throwing
  5. Around