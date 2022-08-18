package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Person {

    @Autowired
    private Pet personPet;

    private static final Logger logger = LoggerFactory.getLogger(Person.class);
    private String name = null;
    private int age = -1;
    private String status = "";

    public void introduce() {
        logger.debug(String.format("Hello! I'am %s and %d of age. I'm currently %s!", name, age, status));
    }

    public void jump() {
        logger.trace("I'm jumping right now!");
    }

    public void walk() {
        logger.trace("I'm walking right now!!");
    }

    public void petDog() {
        personPet.setName("Brownie");
        personPet.setAge(3);
        personPet.setBreed("Husky");
        personPet.walk();
        logger.debug("Person is currently petting its dog!!!");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
