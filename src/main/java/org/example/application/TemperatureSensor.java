package org.example.application;

import java.util.Random;

public class TemperatureSensor implements  Sensor{

    boolean status = false;
    int num;

    public TemperatureSensor() {
    }

    @Override
    public boolean isOn() {
        return this.status;
    }

    @Override
    public void setOn() {
        this.status = true;
    }

    @Override
    public void setOff() {
        this.status = false;
    }

    @Override
    public int read() {
        if(this.status == false) {
            throw new IllegalStateException("it's not on, dude");
        }
        return new Random().nextInt(61)-30;
    }
}
