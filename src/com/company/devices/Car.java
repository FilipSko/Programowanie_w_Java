package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Sellable;

public abstract class Car extends Device implements Sellable {
    public String color;
    public int horsePower;
    public Double price;

    public Car(String model, String producer, int yearOfProduction) {
        super(model, producer, yearOfProduction);
    }

    public String toString() {
        return model + " " + producer + " o kolorze " + color + " i o mocy " + horsePower + " KM, cena: " + price + " rok: " + yearOfProduction;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Car car = (Car) o;

        return
                model.equals(car.model) && producer.equals(car.producer) && color.equals(car.color)
                        && horsePower == car.horsePower && price.equals(car.price);
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód " + model + " " + producer + " odpalił.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("Handlujesz sam ze sobą...");
        } else if (seller.getCar() != this) {
            System.out.println("Nie posiadasz tego auta");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać Cię na zakup tego auta");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.car = seller.car;
        seller.car = null;
        System.out.println("Trasnakcja udana. Auto zostało kupione za " + price);
    }

    public abstract void refuel();
}