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
        Car fiat = new Car(1, "Punto", "Fiat");
        fiat.color = "red";
        fiat.horsePower = 70;
        fiat.price = 2000.0;
        Car fiat2 = new Car(1, "Punto", "Fiat");
        fiat2.color = "red";
        fiat2.horsePower = 70;
        fiat2.price = 2000.0;
        Phone sony = new Phone("Sony", "Xperia", 4.7, "Android");
        me.mobilePhone = sony;

        System.out.println("Porównanie: " + (fiat == fiat2));
        System.out.println("Metoda fiat.equals(fiat2): " + fiat.equals(fiat2));
        System.out.println(fiat2);
        System.out.println(me);
        System.out.println(sony);
        System.out.println(dog);


    }
}