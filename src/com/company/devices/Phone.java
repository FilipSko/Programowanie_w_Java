package com.company.devices;

import com.company.creatures.Human;
import com.company.creatures.Sellable;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;

public class Phone extends Device implements Sellable {
    final Double screenSize;
    final String operatingSystem;
    static final String DEFAULT_SERVER_ADDRESS = "100.0.0.1";
    static final String DEFAULT_SERVER_PROTOCOL = "http";
    static final String DEFAULT_VERSION_NAME = "latest";

    public Phone(String producer, String model, Double screenSize, String operatingSystem, int yearOfProduction, Double cost) {
        super(model, producer, yearOfProduction, cost);
        this.screenSize = screenSize;
        this.operatingSystem = operatingSystem;
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

    public void installAnApp(String appName) {
        this.installAnApp(appName, DEFAULT_VERSION_NAME);
    }

    public void installAnApp(String appName, String version) {
        this.installAnApp(appName, version, DEFAULT_SERVER_ADDRESS);
    }

    public void installAnApp(String appName, String version, String server) {
        URL url = null;
        try {
            url = new URL(DEFAULT_SERVER_PROTOCOL, server, appName + version);
            this.installAnApp(url);
        } catch (MalformedURLException e) {
            e.printStackTrace();
        }
    }

    public void installAnApp(URL appURL) {
        System.out.println("Pobieranie aplikacji " + appURL.getFile() + " ze strony " + appURL.getHost());
        System.out.println("Sprawdzanie, czy aplikacja jest płatna");
        System.out.println("Sprawdzanie, czy masz pieniądze");
        System.out.println("Sprawdzanie, czy masz miejsce");
        System.out.println("Jeśli aplikacja jest bezpłatna lub zapłaciłeś, rozpakowuję.");
        System.out.println("Instalowanie aplikacji " + appURL.getFile());
    }

    public void installAnApp(List<String> appNames) {
        String[] lista = new String[appNames.size()];
        lista = appNames.toArray(lista);
        this.installAnApp(lista);
    }

    public void installAnApp(String[] appNames) {
        for (String appName : appNames) {
            this.installAnApp(appName);
        }
    }
}