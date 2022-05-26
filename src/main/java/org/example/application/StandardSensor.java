package org.example.application;

public class StandardSensor implements Sensor {
    int num;

    public StandardSensor(int deez) {
        this.num = deez;
    }

    @Override
    public boolean isOn() {
        return true;
    }

    @Override
    public void setOn() {
    }

    @Override
    public void setOff() {
    }

    @Override
    public int read() {
        return this.num;
    }
}
