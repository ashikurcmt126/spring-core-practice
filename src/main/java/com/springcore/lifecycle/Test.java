package com.springcore.lifecycle;

import com.springcore.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String args[]){
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("classpath*:lifecycleconfig.xml");
        Samosa samosa = (Samosa) context.getBean("samosa1");
        System.out.println(samosa);

        context.registerShutdownHook();

        System.out.println("=============================");
        Pepsi pepsi = (Pepsi) context.getBean("pepsi");
        System.out.println(pepsi);

        System.out.println("=============================");
        Example example = (Example) context.getBean("example");
        System.out.println(example);

    }
}
