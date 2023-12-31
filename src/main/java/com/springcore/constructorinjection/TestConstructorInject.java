package com.springcore.constructorinjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestConstructorInject {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configConstructorInject.xml");
        Person pObj = (Person) context.getBean("person1");
        System.out.println(pObj);

        Addition adObj =(Addition) context.getBean("addition1");
        adObj.doSum();
    }
}
