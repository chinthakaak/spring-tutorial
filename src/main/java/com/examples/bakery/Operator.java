package com.examples.bakery;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Operator {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring-ctx.xml");

        Pizza pizza=(Pizza)context.getBean("pizza");
        pizza.bake();

        Bun bun = (Bun)context.getBean("bun");
        bun.bake();
    }
}
