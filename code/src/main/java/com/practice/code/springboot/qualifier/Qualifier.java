package com.practice.code.springboot.qualifier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Qualifier {

    @Autowired
    @org.springframework.beans.factory.annotation.Qualifier("Dog")
    private Animal animal;

    public void animalDetails() {
        System.out.println(animal.getLegs());
    }
}
