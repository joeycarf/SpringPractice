package com.testproj;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

@Component
public class Pet {
    private static final Logger logger = LoggerFactory.getLogger(Pet.class);
    private String name = null;
    private int age = -1;
    private String breed = null;

    public void run() {
        logger.trace("Pet is running!!!");
    }

    public void walk() {
        logger.trace("Pet is currently walking...");
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

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }
}
