package com.company.devices;

public class LPG extends Car {
    public LPG(String producer, String model, int yearOfProduction, Double cost) {
        super(producer, model, yearOfProduction, cost);
    }

    @Override
    public void refuel() {
        System.out.println("Auto " + this.producer + " zostało zatankowane do pełna.");
    }
}