package com.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by ka40215 on 8/16/15.
 */
@Configuration
public class AnimalMoverConfig {
    @Bean
    Animal cat(){
        return new Cat();
    }

    @Bean
    AnimalMover animalMover(){
        return new AnimalMover();
    }
}
