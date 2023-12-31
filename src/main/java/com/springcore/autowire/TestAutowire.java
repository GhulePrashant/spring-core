package com.springcore.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestAutowire {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configAutowiring.xml");

        Employee emp1 = context.getBean("employee1", Employee.class);
        System.out.println(emp1);
    }
}
