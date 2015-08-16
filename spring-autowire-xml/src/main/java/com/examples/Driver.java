package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Driver {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ctx.xml");
        Vehicle car=(Car)context.getBean("car");
        car.start();

        ApplicationContext context2=new ClassPathXmlApplicationContext("spring-ctx-2.xml");
        Vehicle plane=(Plane)context2.getBean("plane");
        plane.start();
    }
}
