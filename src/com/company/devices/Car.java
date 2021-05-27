package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Sellable;

public abstract class Car extends Device implements Sellable {
    public String color;
    public int horsePower;

    public Car(String model, String producer, int yearOfProduction, Double cost) {
        super(model, producer, yearOfProduction, cost);
    }

    public String toString() {
        return model + " " + producer + " o kolorze " + color + " i o mocy " + horsePower + " KM, cena: " + cost + " rok: " + yearOfProduction;
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
                        && horsePower == car.horsePower && cost.equals(car.cost);
    }

    @Override
    public void turnOn() {
        System.out.println("Samochód " + model + " " + producer + " odpalił.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) throws Exception {
        if (!seller.hasCar(this)) {
            throw new Exception("Nie posiadasz tego auta");
        }
        if (buyer.cash < price) {
            throw new Exception("Nie stać Cię na zakup tego auta");
        }
        if (buyer.isSpace()) {
            throw new Exception("Nie ma miejsca na nowe auto");
        }
        seller.cash += price;
        buyer.cash -= price;
        seller.removeCar(this);
        buyer.addCar(this);
        System.out.println("Trasnakcja udana. Auto zostało kupione za " + price);
    }

    public abstract void refuel();
}