package com.practice.code.springboot.customAnnotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//Step1 to define annotation
@Target(ElementType.METHOD) //Applicable only on methods
@Retention(RetentionPolicy.RUNTIME) //Makes the annotation available at runtime for processing
public @interface LogExecutionTime {
}
