package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.Car;
import com.company.devices.Disel;
import com.company.devices.Electric;
import com.company.devices.LPG;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Filip", "Skośkiewicz");
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        Pet dog = new Pet("dogos", 30.0, "Fado", null);
        FarmAnimal cow = new FarmAnimal("meat", 120.0, "Milka", null);

        Car fiat = new Disel("Fiat", "Punto", 3004, 2500.0);
        me.setCar(fiat, 1);
        Car volvo = new Electric("Volvo", "Recharge", 2020, 230000.0);
        Car BMW = new LPG("BMW", "3", 1998, 1500.0);
        BMW.color = "black";
        BMW.horsePower = 140;
        volvo.color = "white";
        volvo.horsePower = 320;
        Human brat = new Human("Michał", "Skośkiewicz");
        brat.setSalary(500000.0);
        brat.cash = 1000000.0;
        me.cash = 2000.0;
        brat.setCar(volvo, 0);
        brat.setCar(BMW, 1);

        System.out.println(brat.getGaragePrice());
        System.out.println(brat.sortCars());

        fiat.sell(me, brat, 500.0);
        System.out.println(brat);
        /*
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
        */

        System.out.println(me);

    }
}