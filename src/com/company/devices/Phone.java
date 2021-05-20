package com.company.devices;

public class Phone extends Device {
    final Double screenSize;
    final String operatingSystem;

    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction) {
        super(model, producer, yearOfProduction);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
    }

    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon " + model + " " + producer + " został włączony.");
    }
}