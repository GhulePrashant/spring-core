package com.springcore.reference;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestReferenceInjection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configReference.xml");
        A obj = (A) context.getBean("refA");
        System.out.println(obj.toString());
    }
}
