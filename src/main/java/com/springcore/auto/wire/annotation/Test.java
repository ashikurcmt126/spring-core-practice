package com.springcore.auto.wire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
/*
@Autowired Annotation for Autowiring
*/
public class Test {
    public static void main(String args[]){
        ApplicationContext context = new ClassPathXmlApplicationContext("classpath*:autoannotationconfig.xml");
        Emp emp = context.getBean("emp1", Emp.class);
        System.out.println(emp);
    }
}
