package com.company.devices;

import com.company.Human;
import com.company.Sellable;

public class Phone extends Device implements Sellable {
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

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("Handlujesz sam ze sobą...");
        } else if (seller.mobilePhone != this) {
            System.out.println("Nie posiadasz tego telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać Cię na zakup tego telefonu");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.mobilePhone = seller.mobilePhone;
        seller.mobilePhone = null;
        System.out.println("Trasnakcja udana. Telefon został kupiony za " + price);
    }
}