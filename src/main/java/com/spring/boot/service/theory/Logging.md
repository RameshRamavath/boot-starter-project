## Logging in Spring Boot

### Logback vs SLF4J vs Log4J

**Proper Logging Framework is very much required in any enterprise applications**

*Does system.out.println(logMessage) is good approach - Obviously not - A proper logging mechanism will have below possibilities*

- **Configurable**
- **Log Levels**
- **Log Destination**
- **...and much more**

**Spring boot by default gives slf4j logging**

    
        ---------  slf4j ------

    import org.slf4j.Logger;
    import org.slf4j.LoggerFactory;
    Logger logger = LoggerFactory.getLogger(class name)
    
 **Logback-classic natively implements the SLF4J API**
 
 **Logback is intended as a successor to the popular log4j project, picking up where log4j leaves off.**
 
 *So better to use **slf4j** in spring boot applications*
    
    ---------  log4j ------
    
    import org.apache.logging.log4j.LogManager;
    import org.apache.logging.log4j.Logger;
    Logger logger1 = LogManager.getLogger(AOP.class);

    
**Configuration of log levels**

*configure application.properties file*

    logging.level.root = TRACE/INFO/DEBUG
    
    
**History**

   - JDK has Java logging framework :: java.util.logging (since 1.4)
     
         Logger --> get Logger (class name)
         
         Log levels are not proper in JDK -- INFO/SEVERE/FINE -- these are not enough and this framework is not that good performance wise
         
         --- people started creating OPEN SOURCE LOGGING FRAMEWORKS and created a mess with many open source libs
         
   - **Log4J** first in open source
   
         - log4j.Logger
         - log levels -- info/debug/error
         - appenders - file/consol/rolling file/JDBC/SMTP {via mail}/JMS
         - formatting options for logging messages
         
         still this is not end of source
         
         if we need to change from one lib to another --> we need to change all classes in our existing code
   
   - **Apache commons lib - SLF4J**
   
         slf4j dosn't do the actul logging but its providing the fascade with other lib
         
   - **Two popular lib's currently available**
    
     - Logback
     - Log4j2   --  both with improved functions & performance over log4j
        
           both has support to slf4j also
   