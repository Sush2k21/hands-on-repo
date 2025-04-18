package com.practice.code.springboot.customAnnotation;

import org.springframework.stereotype.Service;

//Step3
@Service
public class SampleService {
    @LogExecutionTime
    public String performTask() throws InterruptedException {
        Thread.sleep(1000);
        return "Task completed";
    }
}
