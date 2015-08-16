package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Spacer {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-jet.xml");
        Vehicle jet=(Jet)context.getBean("jet");
        jet.start();
    }
}
