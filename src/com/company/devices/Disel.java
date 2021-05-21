package com.company.devices;

public class Disel extends Car {
    public Disel(String producer, String model, int yearOfProduction) {
        super(producer, model, yearOfProduction);
    }

    @Override
    public void refuel() {
        System.out.println("Auto " + this.producer + " zostało zalane do pełna.");
    }
}