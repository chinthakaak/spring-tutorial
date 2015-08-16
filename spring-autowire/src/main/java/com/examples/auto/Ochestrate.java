package com.examples.auto;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by ka40215 on 8/16/15.
 */
public class Ochestrate {
    public static void main(String[] args) {
        ApplicationContext context=new ClassPathXmlApplicationContext("spring-ctx.xml");
        InstrumentPlayer instrumentPlayer1=(InstrumentPlayer)context.getBean("player1");
        instrumentPlayer1.play();

        InstrumentPlayer instrumentPlayer2=(InstrumentPlayer)context.getBean("player2");
        instrumentPlayer2.play();

        InstrumentPlayer flutePlayer =(InstrumentPlayer)context.getBean("flutePlayer");
        flutePlayer.play();

        StringPlayer pianoPlayer =(StringPlayer)context.getBean("pianoPlayer");
        pianoPlayer.play();
    }
}
