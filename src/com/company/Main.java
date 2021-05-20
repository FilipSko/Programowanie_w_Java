package com.company;

public class Main {

    public static void main(String[] args) {

        Human me = new Human();
        me.firstName = "Filip";
        me.lastName = "Skośkiewicz";
        me.pet = new Animal("Felis", 2.0);
        me.car = new Car("Punto II", "Fiat", "Red", 70);

        me.setSalary(2500.0);
        me.getSalary();
        me.setSalary(5000.0);
        me.getSalary();

    }
}