package com.company;

import java.io.File;
import java.util.Scanner;

public class Animal implements Sellable {
    public String species;
    public Double weight;
    String name;
    File pic;

    public String toString() {
        return "Species: " + species + " waga: " + weight + " imię: " + name + " Zdjęcie " + pic;
    }

    void feed() {
        System.out.println("Twój zwierzak waży: " + this.weight + "kg.");
        if (this.weight <= 0) {
            System.out.println("Nie można nakarmić martwego zwierzata");
            System.exit(0);
        } else {
            System.out.println("Dzięki za jedzienie");
            this.weight += 1;
            System.out.println("Twój zwierzak przytył i waży " + this.weight + "kg.");
        }
    }
    void takeForAWalk(){
        System.out.println("Twój zwierzak waży " + this.weight + "kg.");
        if (this.weight <= 0){
            System.out.println("Nie można iść na spacer z martwym zwierzakiem");
            System.exit(0);
        }
        else if(this.weight == 1){
            Scanner answer = new Scanner(System.in);
            System.out.println("Bardzo możliwe, że Twój zwierzak nie przeżyje tego spaceru\nCzy na pewno chcesz z nim iść?");
            String user_answer = answer.nextLine();
            if (user_answer.equals("Tak")){
                this.weight -= 1;
                System.out.println("Twój zwierzak nie żyje");
                System.exit(0);
            } else {
                System.out.println("Uratowałeś mu życie doktorku, daj mu coś zjeść");
            }
        } else {
            this.weight -= 1;
            System.out.println("Twój zwierzak wrócił ze spaceru i waży teraz " + this.weight + "kg.");
        }
    }

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
