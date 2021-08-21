package com.springcore.javaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.springcore.javaconfig")
public class javaConfig {

    @Bean
    public Samosa getSamosa(){
        return new Samosa();
    }

    @Bean(name = {"getStudent", "student", "temp"}) //we can multiple bean name as our choose
    public Student getStudent(){
        //creating new student object
        Student student = new Student(getSamosa());
        return student;
    }

}
