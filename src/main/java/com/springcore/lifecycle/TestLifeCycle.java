package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestLifeCycle {
    public static void main(String[] args) {
//        ApplicationContext context = new ClassPathXmlApplicationContext("configLifeCycle.xml");
        AbstractApplicationContext context = new ClassPathXmlApplicationContext("configLifeCycle.xml");
        context.registerShutdownHook();

        Samosa sobj = (Samosa) context.getBean("samosa1");

        System.out.println(sobj);
        // registering ShutDownHook() is available in AbstractApplicationContext abstract class
        System.out.println("------------------------------------------");
        Pepsi pObj = (Pepsi) context.getBean("pepsi1");

        System.out.println(pObj);

        Example exObj = (Example) context.getBean("ex1");
        System.out.println(exObj);

    }
}
