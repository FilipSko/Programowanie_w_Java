package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        Pet dog = new Pet("dogos", 30.0, "Fado", null);
        FarmAnimal cow = new FarmAnimal("meat", 120.0, "Milka", null);
        cow.takeForAWalk();
        me.pet = dog;
        cow.feed();
        dog.feed();
        dog.takeForAWalk();
        cow.beEaten();

    }
}