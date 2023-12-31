package com.springcore.javaconfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Driver {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("configJavaConfig.xml");
        ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
        Student firstStudent = context.getBean("getStudent", Student.class);
        firstStudent.study();
        System.out.println(firstStudent);
        firstStudent.getSamosa().display();
    }
}
