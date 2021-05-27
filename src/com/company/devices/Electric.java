package com.company.devices;

public class Electric extends Car {
    public Electric(String producer, String model, int yearOfProduction, Double cost) {
        super(producer, model, yearOfProduction, cost);
    }

    @Override
    public void refuel() {
        System.out.println("Auto " + this.producer + " zostało naładowane pełna.");
    }
}