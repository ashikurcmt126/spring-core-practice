package com.springcore.constructioninjection;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:constructorinject.xml");
        Person person1 = (Person) context.getBean("person");
        System.out.println(person1);

        Addition addition = (Addition) context.getBean("addition");
        addition.doSum();
    }
}
