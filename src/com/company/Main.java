package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        me.pet = new Animal("Felis", 2.0);
        Car fiat = new Car("Punto", "Fiat", "red", 70);
        fiat.price = 2000.0;
        me.setSalary(4000.0);
        me.setCar(fiat);


    }
}