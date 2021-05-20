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

        sony.turnOn();
        fiat.turnOn();
    }
}