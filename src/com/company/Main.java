package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        Pet dog = new Pet("dogos", 30.0, "Fado", null);
        FarmAnimal cow = new FarmAnimal("meat", 120.0, "Milka", null);

        Car fiat = new Disel("Fiat", "Punto", 2003);
        fiat.refuel();

        Car volvo = new Electric("Volvo", "Recharge", 2020);
        volvo.refuel();

        Car BMW = new LPG("BMW", "3", 1998);
        BMW.refuel();

        Phone sony = new Phone("Sony", "Xperia", 4.7, "Android", 2013);
        sony.installAnApp("Pokemongo");
        sony.installAnApp("Messenger", "2.4.1.");
        sony.installAnApp("Signal", "3.1.1.", "download.signal.com");

        List<String> appNames = new ArrayList<>();
        appNames.add("Google");
        appNames.add("Yazio");
        appNames.add("Facebook");

        sony.installAnApp(appNames);


    }
}