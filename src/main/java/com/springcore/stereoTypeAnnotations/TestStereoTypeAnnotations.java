package com.springcore.stereoTypeAnnotations;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStereoTypeAnnotations {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configStereoTypeAnnotations.xml");

        Student student = context.getBean("student", Student.class);
        System.out.println(student.toString());
        System.out.println(student.hashCode());

        Student student1 = context.getBean("student", Student.class);
        System.out.println(student1.hashCode());
    }
}
