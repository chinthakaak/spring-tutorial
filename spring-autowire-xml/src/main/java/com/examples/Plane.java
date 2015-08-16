package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Plane implements Vehicle {
    @Autowired(required = false)
    private Baggage baggage;

    @Autowired(required = false)
    @Qualifier("engine1")
    private Engine e1;

    @Autowired
    @Qualifier("engine2")
    private Engine e2;
    public void start() {
        System.out.println(e1.start());
        System.out.println(e2.start());
    }
}
