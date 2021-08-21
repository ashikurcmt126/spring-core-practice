package com.springcore.stereotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:stereotypeconfig.xml");
        Student student1 = context.getBean("student",Student.class);
        System.out.println(student1);

        System.out.println(student1.getAddress());
        System.out.println(student1.getAddress().getClass().getName());
        System.out.println(student1.hashCode());

        System.out.println("=========Singletone test====================");
        Student student2 = context.getBean("student",Student.class);
        System.out.println(student2.hashCode());

        System.out.println("============Prototype test==========");
        Teacher teacher1 = context.getBean("teacher",Teacher.class);
        Teacher teacher2 = context.getBean("teacher",Teacher.class);
        System.out.println(teacher1.hashCode());
        System.out.println(teacher2.hashCode());


    }
}
