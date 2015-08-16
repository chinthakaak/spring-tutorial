package com.examples.auto;

/**
 * Created by ka40215 on 8/16/15.
 */
public class StringPlayer {// extends InstrumentPlayer {
    private Instrument instrument;

    public StringPlayer(Instrument instrument) {
        this.instrument = instrument;
    }
    public void play(){
        System.out.println("Playing "+instrument.getName());
    }
}
