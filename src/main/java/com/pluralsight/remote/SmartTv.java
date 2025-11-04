package com.pluralsight.remote;

import com.pluralsight.controls.Controllable;
import com.pluralsight.controls.Streamable;

public class SmartTv implements Controllable, Streamable {
    private String brand;
    private int currentChannel;
    private int volume;
    private boolean isOn;
    private String connectedNetwork;
    private String currentApp;

    public SmartTv(String brand, int currentChannel, int volume, boolean isOn, String connectedNetwork, String currentApp) {
        this.brand = brand;
        this.currentChannel = currentChannel;
        this.volume = volume;
        this.isOn = isOn;
        this.connectedNetwork = connectedNetwork;
        this.currentApp = currentApp;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getCurrentChannel() {
        return currentChannel;
    }

    public void setCurrentChannel(int currentChannel) {
        this.currentChannel = currentChannel;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public boolean isOn() {
        System.out.println("Smart TV is now ON");
        return isOn;
    }

    public void setOn(boolean on) {
        isOn = on;
    }

    public String getConnectedNetwork() {
        return connectedNetwork;
    }

    public void setConnectedNetwork(String connectedNetwork) {
        this.connectedNetwork = connectedNetwork;
    }

    public String getCurrentApp() {
        return currentApp;
    }

    public void setCurrentApp(String currentApp) {
        this.currentApp = currentApp;
    }

    @Override
    public void turnOn() {

    }

    @Override
    public void turnOff() {

    }

    @Override
    public void changeChannel(int channel) {

    }

    @Override
    public void adjustVolume(int level) {

    }

    @Override
    public void connectToWifi(String network) {

    }

    @Override
    public void selectApp(String app) {

    }

    @Override
    public void playContent(String title) {

    }
}
