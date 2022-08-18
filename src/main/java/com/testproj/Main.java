package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    private static final Logger logger = LoggerFactory.getLogger(Main.class);


    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ApplicationConfig.class);
        Person person1 = context.getBean(Person.class);
        person1.setName("Joey");
        person1.setAge(25);
        person1.setStatus("Alive");
        person1.introduce();
        person1.petDog();
        context.close();
    }
}
