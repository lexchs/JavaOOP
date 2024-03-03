package clients.impl;

import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Owner;

import java.time.LocalDate;

public class Parrot extends Animal implements Flyable, Goable {
    public Parrot(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Parrot() {
        this.name = "parrot";
    }

    @Override
    public void eat() {
        System.out.println("Parrot eat");
    }

    @Override
    public double fly() {
        return 8;
    }

    @Override
    public double go() {
        return 1;
    }
}

