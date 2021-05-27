package com.company.devices;

public abstract class Device {
    final String model;
    final String producer;
    public final int yearOfProduction;
    public Double cost;

    public Device(String model, String producer, int yearOfProduction, Double cost) {
        this.model = model;
        this.producer = producer;
        this.yearOfProduction = yearOfProduction;
        this.cost = cost;
    }

    @Override
    public String toString() {
        return model + " " + producer + " " + yearOfProduction + " " + cost;
    }

    abstract public void turnOn();
}
