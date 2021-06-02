package com.company.creatures;

import com.company.devices.Car;
import com.company.devices.Device;
import com.company.devices.Phone;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class Human implements Sellable {
    public String firstName;
    public String lastName;
    public Pet pet;
    public Phone mobilePhone;
    public Car[] garage;
    private Double salary;
    public Double cash;

    public Human(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[2];
    }

    public Human(String firstName, String lastName, int garageSize) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.garage = new Car[garageSize];
    }

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

    public Double getGaragePrice() {
        Double garagePrice = 0.0;
        for (Device car : this.garage) {
            garagePrice = garagePrice + car.cost;
        }
        return garagePrice;
    }

    public List<Car> sortCars() {
        return Arrays.stream(garage).sorted(Comparator.comparing(car -> car.yearOfProduction)).collect(Collectors.toList());
    }

    public boolean isSpace() {
        for (Car car : garage) {
            if (car == null) return true;
        }
        return false;
    }

    public void removeCar(Car removedCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == removedCar) {
                this.garage[i] = null;
            }
        }
    }

    public void addCar(Car newCar) {
        for (int i = 0; i < garage.length; i++) {
            if (this.garage[i] == null) {
                this.garage[i] = newCar;
                newCar.owners.add(this);
            }

            return;
        }
    }

    public boolean hasCar(Car newCar) {
        for (Car car : garage) {
            if (car == newCar) return true;
        }
        return false;
    }

    public String toString() {
        return firstName + " " + lastName + " posiada zwierzę: " + pet + " i telefon " + mobilePhone + ". Ilość Samochodów to: " + Arrays.toString(garage) + ". Jego pensja to: " + salary + " pieniądze: " + cash;
    }

    @Override
    public void sell(Human seller, Human buyer, Double price) {
        System.out.println("Za handel ludźmi można trafić do więzienia na czas nie krótszy od lat 3!");
    }
}
