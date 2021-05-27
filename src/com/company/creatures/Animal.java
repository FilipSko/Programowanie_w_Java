package com.company.creatures;

import java.io.File;

public abstract class Animal implements Sellable, Feedable {
    public final String species;
    public Double weight;
    public String name;
    public File pic;

    public Animal(String species, Double weight, String name, File pic) {
        this.species = species;
        this.weight = weight;
        this.name = name;
        this.pic = pic;
    }
    @Override
    public String toString() {
        return "Species: " + species + " waga: " + weight + " imię: " + name + " Zdjęcie " + pic;
    }

    abstract public void feed();

    abstract public void takeForAWalk();


    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("Handlujesz sam ze sobą...");
        } else if (seller.pet != this) {
            System.out.println("Nie posiadasz tego zwierzęcia");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać Cię na zakup tego zwierzęcia");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.pet = seller.pet;
        seller.pet = null;
        System.out.println("Trasnakcja udana. Zwierzę zostało kupione za " + price);
    }
}
