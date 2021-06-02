package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Sellable;

import java.util.ArrayList;
import java.util.List;

public class Phone extends Device implements Sellable {
    final Double screenSize;
    final String operatingSystem;
    List<Application> appList;

    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction, Double cost) {
        super(model, producer, yearOfProduction, cost);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
        this.appList = new ArrayList<>();
    }

    @Override
    public String toString() {
        return producer + " " + model + " " + screenSize + " " + operatingSystem + " " + yearOfProduction;
    }

    @Override
    public void turnOn() {
        System.out.println("Telefon " + model + " " + producer + " został włączony.");
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        if (seller == buyer) {
            System.out.println("Handlujesz sam ze sobą...");
        } else if (seller.mobilePhone != this) {
            System.out.println("Nie posiadasz tego telefonu");
        } else if (buyer.cash < price) {
            System.out.println("Nie stać Cię na zakup tego telefonu");
        }
        seller.cash += price;
        buyer.cash -= price;
        buyer.mobilePhone = seller.mobilePhone;
        seller.mobilePhone = null;
        System.out.println("Trasnakcja udana. Telefon został kupiony za " + price);
    }

    public void installAnApp(Human owner, Application app) {
        if (owner.cash < app.price) {
            System.out.println("Nie masz wystarczających środków");
        } else {
            owner.cash = owner.cash - app.price;
            this.appList.add(app);
        }
    }

    public boolean isInstalled(Application appObject) {
        for (Application app : appList) {
            if (app == appObject) {
                return true;
            }
        }
        return false;
    }

    public boolean isInstalled(String appName) {
        for (Application app : appList) {
            if (app.name.equals(appName)) {
                return true;
            }
        }
        return false;
    }

    public void freeApps() {
        for (Application app : appList) {
            if (app.price == 0.0) {
                System.out.println(app);
            }
        }
    }

    public void allApps() {
        for (Application app : appList) {
            System.out.println(app);
        }
    }

    public void nameAppSort() {
        appList.sort(Application.names);

        for (Application app : appList) {
            System.out.println(app);
        }
    }

    public void priceAppSort() {
        appList.sort(Application.prices);

        for (Application app : appList) {
            System.out.println(app);
        }
    }
}



