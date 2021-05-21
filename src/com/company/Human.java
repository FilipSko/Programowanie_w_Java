package com.company;

import com.company.devices.Car;
import com.company.devices.Phone;

import java.time.LocalDateTime;

public class Human implements Sellable {
    String firstName;
    String lastName;
    Animal pet;
    public Phone mobilePhone;
    public Car car;
    private Double salary;
    public Double cash;

    public Double getSalary() {
        LocalDateTime current = LocalDateTime.now();
        System.out.println("Dane o Twojej wypłacie zostały pobrane " + LocalDateTime.now() + "i wynosiła wtedy " + this.salary);
        return this.salary;
    }

    public void setSalary(Double salary) {
        if (salary <= 0) {
            try {
                throw new Exception("Wynagrodzenie nie może być tak niskie!");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        System.out.println(this.firstName + " " + this.lastName + "! Twoja wypłata została zmieniona i wynosi teraz: " + salary);
        System.out.println("Informacje o wypłacie zostały wysłane do księgowości");
        System.out.println("Konieczne jest odebranie aneksu do umowy od pani Hani z kadr.");
        System.out.println("ZUS i US już wiedzą o tej zmianie, więc nie ma sensu ukrywać dochodu");

        this.salary = salary;

    }

    public Car getCar() {
        return this.car;
    }

    public void setCar(Car car) {
        if (this.salary > car.price) {
            System.out.println("Udao się kupić za gotówkę!");
            this.car = car;
        } else if (this.salary > car.price / 12) {
            System.out.println("Udało się kupić na kredyt. No trudno");
            this.car = car;
        } else {
            System.out.println("Zapisz się na studia i znajdź nową robotę lub błagaj o podwyżkę.");
        }

    }

    public String toString() {
        return firstName + " " + lastName + " posiada zwierzę: " + pet.name + " i telefon " + mobilePhone + ". Samochód: " + car + ". Jego pensja to: " + salary;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Za handel ludźmi można trafić do więzienia na czas nie krótszy od lat 3!");
    }
}