package com.company;

import com.company.creatures.FarmAnimal;
import com.company.creatures.Human;
import com.company.creatures.Pet;
import com.company.devices.*;

public class Main {

    public static void main(String[] args) throws Exception {

        Human me = new Human("Filip", "Skośkiewicz", 2);
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        Pet dog = new Pet("dogos", 30.0, "Fado", null);
        FarmAnimal cow = new FarmAnimal("meat", 120.0, "Milka", null);

        Car fiat = new Disel("Fiat", "Punto", 3004, 2500.0);
        Car volvo = new Electric("Volvo", "Recharge", 2020, 230000.0);
        Car BMW = new LPG("BMW", "3", 1998, 1500.0);
        BMW.color = "black";
        BMW.horsePower = 140;
        volvo.color = "white";
        volvo.horsePower = 320;

        Human brat = new Human("Michał", "Skośkiewicz", 3);
        Phone sony = new Phone("Sony", "Xperia", 4.7, "Android", 2013, 2500.0);
        Phone iphone = new Phone("Apple", "XR", 5.1, "iOS", 2018, 3700.0);

        me.addCar(fiat);
        brat.addCar(volvo);
        me.cash = 1000.0;
        brat.cash = 400.0;
        System.out.println("czy brat ma volvo? " + brat.hasCar(volvo));
        System.out.println("czy ja mam fiata? " + me.hasCar(fiat));
        fiat.sell(me, brat, 200.0);
        volvo.sell(brat, me, 800.0);
        System.out.println("Liczba sprzedaży fiata: " + fiat.numberOfSells());
        System.out.println("Liczba właścicieli fiata: " + fiat.owners.size());

        Application tinder = new Application("tinder", "1.3.2", 0.0);
        Application asphalt = new Application("asphalt", "4.2.2", 20.0);
        Application luxury = new Application("luxury", "1.0.0", 750.0);

        me.mobilePhone = sony;
        brat.mobilePhone = iphone;

        sony.installAnApp(me, tinder);
        iphone.installAnApp(brat, asphalt);

        System.out.println("Czy sony ma apkę tinder? " + sony.isInstalled(tinder));
        System.out.println("Czy iphone ma apkę asphalt? " + iphone.isInstalled("asphalt"));

        sony.installAnApp(me, luxury);
        me.cash = 2000.0;
        sony.installAnApp(me, luxury);
        sony.allApps();
        sony.nameAppSort();
        sony.priceAppSort();


    }
}