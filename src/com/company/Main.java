package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        Animal dog = new Animal();
        dog.species = "dogos";
        dog.name = "Fado";
        dog.weight = 30.0;
        me.pet = dog;
        Car fiat = new Car(1, "Punto", "Fiat", 2003);
        fiat.color = "red";
        fiat.horsePower = 70;
        fiat.price = 2000.0;
        Phone sony = new Phone("Sony", "Xperia", 4.7, "Android", 2015);
        me.mobilePhone = sony;
        me.car = fiat;
        me.cash = 4000.0;
        Human mate = new Human();
        mate.firstName = "Kamil";
        mate.lastName = "Grosicki";
        mate.cash = 7000.0;

        // Sprzedaż telefonu:
        System.out.println("Moje pieniądze: " + me.cash);
        System.out.println("Pieniądze ziomka: " + mate.cash);
        sony.sell(me, mate, 1500.0);
        System.out.println("Telefon ziomka: " + mate.mobilePhone);
        System.out.println("Mój telefon: " + me.mobilePhone);
        // Sprzedaż samachodu:
        System.out.println("Moje pieniądze: " + me.cash);
        System.out.println("Pieniądze ziomka: " + mate.cash);
        fiat.sell(me, mate, 3000.0);
        System.out.println("Samochód ziomka: " + mate.car);
        System.out.println("Mój samochód: " + me.car);
        // Sprzedaż zwierzęcia:
        System.out.println("Moje pieniądze: " + me.cash);
        System.out.println("Pieniądze ziomka: " + mate.cash);
        dog.sell(me, mate, 1000.0);
        System.out.println("Zwierzę ziomka: " + mate.pet);
        System.out.println("Móje zwierzę: " + me.pet);
        // Sprzedaż człowieka:
        Human x = new Human();
        x.sell(me, mate, 400.0);
    }
}