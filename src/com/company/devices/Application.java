package com.company.devices;

import java.util.Comparator;

public class Application {
    public static Comparator<Application> names = Comparator.comparing(app -> app.name);
    public static Comparator<Application> prices = Comparator.comparing(app -> app.price);
    public String name;
    public String version;
    public Double price;

    public Application(String name, String version, Double price) {
        this.name = name;
        this.version = version;
        this.price = price;
    }

    public String toString() {
        return "Nazwa aplikacji " + name + " wersja aplikacji: " + version + " cena aplikacji: " + price;
    }
}
