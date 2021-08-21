package com.springcore.standalone.collections;

import com.springcore.collections.Emp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:standaloneconfig.xml");
        Person person = (Person)context.getBean("person1");
        System.out.println(person);
        System.out.println(person.getFriends().getClass().getName());

        System.out.println("=======================");
        System.out.println(person.getFeestructure());
        System.out.println(person.getFeestructure().getClass().getName());

        System.out.println("========================");
        System.out.println(person.getProperties());
    }
}
