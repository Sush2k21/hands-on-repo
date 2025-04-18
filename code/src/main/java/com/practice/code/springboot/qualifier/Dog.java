package com.practice.code.springboot.qualifier;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("Dog")
public class Dog implements Animal{

    @Override
    public int getLegs() {
        return 4;
    }
}

@Component
@Primary
class Cat implements Animal{

    @Override
    public int getLegs() {
        return 2;
    }
}
