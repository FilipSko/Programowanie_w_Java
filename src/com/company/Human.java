package com.company;

import java.time.LocalDateTime;

public class Human {
    String firstName;
    String lastName;
    Animal pet;
    Phone mobilePhone;
    private Car car;
    private Double salary;

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
}