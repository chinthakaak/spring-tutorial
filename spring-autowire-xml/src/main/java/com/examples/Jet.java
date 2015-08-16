package com.examples;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Jet implements Vehicle{
    @Autowired
    private Pilots pilot;
    @Autowired
    private Pilots copilot;

    @Autowired
    @QualifiedTrainee
    private Pilots trainee;

    public void start() {
        System.out.println("Starting the JET");
    }
}
