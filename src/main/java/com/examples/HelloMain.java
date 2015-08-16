package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class HelloMain {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ctx.xml");
        Hello hello =(Hello)context.getBean("hello");
        hello.hello();
    }
}
