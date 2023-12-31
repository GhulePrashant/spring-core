package com.springcore.standalonecollection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestStandloneCollection {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("configStandaloneCollection.xml");
        Person person = (Person) context.getBean("person1");
        System.out.println(person.getFriendsList());
        System.out.println(person.getContactDetails());
        System.out.println(person.getProperties());
    }
}
