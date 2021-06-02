package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Sellable;

import java.util.ArrayList;
import java.util.List;

public abstract class Car extends Device implements Sellable {
    public String color;
    public int horsePower;
    public List<Human> owners = new ArrayList<>();

    public Car(String model, String producer, int yearOfProduction, Double cost) {
        super(model, producer, yearOfProduction, cost);
    }

    public String toString() {
        return model + " " + producer + " o kolorze " + color + " i o mocy " + horsePower + " KM, cena: " + cost + " rok: " + yearOfProduction;
    }

    private boolean lastPossessor(Human human) {
        int possessorsNumber = this.owners.size();
        if (possessorsNumber == 0) {
            return false;
        }
        if (possessorsNumber == 1) {
            return this.owners.get(0) == human;
        }
        return human == (this.owners.get(possessorsNumber - 1));
    }

    public boolean ifOwned(Human human) {
        return this.owners.contains(human);
    }

    public Integer numberOfSells() {
        return this.owners.size();
    }

    public boolean transactionParties(Human seller, Human buyer) {
        if (ifOwned(seller) && ifOwned(buyer)) {
            return this.owners.indexOf(buyer) == this.owners.indexOf(seller) + 1;
        }

        return false;
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
        if (!this.lastPossessor(seller) || !seller.hasCar(this)) {
            throw new Exception("Nie posiadasz tego auta");
        }
        if (buyer.cash < price) {
            throw new Exception("Nie stać Cię na zakup tego auta");
        }
        if (!buyer.isSpace()) {
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