package com.examples;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Car implements Vehicle {
//    /**property injection*/
//    @Autowired
    private Engine engine;

//    /**setter injection*/
//    @Autowired
//    public void setEngine(Engine engine) {
//        this.engine = engine;
//    }

    /**constructor injection*/
    @Autowired
    public Car(Engine engine){
        this.engine=engine;
    }

    public void start() {
        System.out.println(engine.start());
    }
}
