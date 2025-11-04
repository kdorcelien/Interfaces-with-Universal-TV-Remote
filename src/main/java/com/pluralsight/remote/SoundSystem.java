package com.pluralsight.remote;

import com.pluralsight.controls.Controllable;

public class SoundSystem implements Controllable {
    private String brand;
    private int volume;
    private boolean isOn;

    public SoundSystem(String brand, int volume, boolean isOn) {
        this.brand = brand;
        this.volume = volume;
        this.isOn = isOn;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void changeChannel(int channel) {
        System.out.println("Not Supported");
    }

    @Override
    public void adjustVolume(int level) {

    }
}
