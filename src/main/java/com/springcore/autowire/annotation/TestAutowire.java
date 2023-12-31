package com.springcore.autowire.annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowiringAnnotation.xml");

        Employee emp1 = context.getBean("employee1", Employee.class);
        System.out.println(emp1);
    }
}
