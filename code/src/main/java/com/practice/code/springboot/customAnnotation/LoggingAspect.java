package com.practice.code.springboot.customAnnotation;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.stereotype.Component;

//Step2
//Implement annotaion's behavior using AOP
@Aspect // Marks the class as an AOP aspect
@Component
public class LoggingAspect {
    @Around("@annotation(LogExecutionTime)") // Intercepts method annotated with @LogExecutionTime
    public Object logExceutionTime(ProceedingJoinPoint joinPoint) throws Throwable {
        long start = System.currentTimeMillis();
        Object proceed = joinPoint.proceed();
        long exceutionTime = System.currentTimeMillis() - start;
        System.out.println(joinPoint.getSignature() + "executed in " + exceutionTime + "ms");
        return proceed;
    }
}
