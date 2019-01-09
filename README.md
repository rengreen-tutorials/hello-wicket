# Hello World - Wicket application with Spring Boot

This is basic web application, which prints Hello World, with some formating in CSS.  
  
It is created with Maven, Wicket and Spring Boot, according to:  
https://github.com/MarcGiffing/wicket-spring-boot  *by MarcGiffing*  
https://dzone.com/articles/enhance-wicket-with-spring-boot *by Andrea Del Bene*  

**Problem:**  
In Wicket, by default, HTML file **HomePage.html** and related page class **HomePage.java** must have the same name and must be in the same package. 
Maven, by default, is looking for HTML file under src/main/resources.  
It causes error: *Can not determine Markup. Component is not yet connected to a parent.*

**Solution applied:**  
To specify resource directories in **pom.xml** file:

```xml
<resource>
    <directory>src/main/resources</directory>
</resource>
<resource>
    <directory>src/main/java</directory>
    <includes>
        <include>**</include>
    </includes>
    <excludes>
        <exclude>**/*.java</exclude>
    </excludes>
</resource>
```

