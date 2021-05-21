package com.company.devices;

public abstract class Device {
    final String model;
    final String producer;
    final int yearOfProduction;

    public Device(String model, String producer, int yearOfProduction) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
    }

    public String toString() {
        return model + " " + producer + " " + yearOfProduction;
    }

    abstract public void turnOn();
}
