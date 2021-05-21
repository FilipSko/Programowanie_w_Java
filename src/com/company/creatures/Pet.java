package com.company.creatures;

import java.io.File;
import java.util.Scanner;

public class Pet extends Animal {
    public Pet(String species, Double weight, String name, File pic) {
        super(species, weight, name, pic);
    }

    @Override
    public void feed() {
        System.out.println("Twój zwierzak " + this.name + " waży: " + this.weight + "kg.");
        if (this.weight <= 0) {
            System.out.println("Nie można nakarmić martwego zwierzata");
            System.exit(0);
        } else {
            System.out.println(this.name + " mówi: Dzięki za jedzienie");
            this.weight += 1;
            System.out.println("Twój zwierzak " + this.name + " przytył i waży " + this.weight + "kg.");
        }
    }

    @Override
    public void feed(Double foodWeight) {
        System.out.println("Twój zwierzak " + this.name + " waży: " + this.weight + "kg.");
        if (this.weight <= 0) {
            System.out.println("Nie można nakarmić martwego zwierzata");
            System.exit(0);
        } else {
            System.out.println(this.name + " mówi: Dzięki za jedzienie");
            this.weight += foodWeight;
            System.out.println("Twój zwierzak " + this.name + " przytył i waży " + this.weight + "kg.");
        }
    }

    @Override
    public void takeForAWalk() {
        System.out.println("Twój zwierzak " + this.name + " waży " + this.weight + "kg.");
        if (this.weight <= 0) {
            System.out.println("Nie można iść na spacer z martwym zwierzakiem");
            System.exit(0);
        } else if (this.weight == 1) {
            Scanner answer = new Scanner(System.in);
            System.out.println("Bardzo możliwe, że Twój zwierzak nie przeżyje tego spaceru\nCzy na pewno chcesz z nim iść?");
            String user_answer = answer.nextLine();
            if (user_answer.equals("Tak")) {
                this.weight -= 1;
                System.out.println("Twój zwierzak " + this.name + " nie żyje");
                System.exit(0);
            } else {
                System.out.println("Uratowałeś mu życie doktorku, daj mu coś zjeść");
            }
        } else {
            this.weight -= 1;
            System.out.println("Twój zwierzak " + this.name + " wrócił ze spaceru i waży teraz " + this.weight + "kg.");
        }
    }
}
