package com.examples;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class AnimalMoverTest {
    public static void main(String[] args) {
        ApplicationContext context=new AnnotationConfigApplicationContext(AnimalMoverConfig.class);
        AnimalMover animalMover=context.getBean(AnimalMover.class);
        animalMover.go();
    }
}
