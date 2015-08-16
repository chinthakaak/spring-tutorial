package com.examples;

import org.springframework.beans.factory.annotation.Autowired;

/**
 * Created by ka40215 on 8/16/15.
 */
public class AnimalMover {
    @Autowired
    private Animal animal;

    void go(){
        animal.move();
    }
}
