package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Lion extends Animal implements Swimable, Goable {
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        this.name = "lion";
    }

    @Override
    public void eat() {
        System.out.println("Lion eat");
    }

    @Override
    public double go() {
        return 8;
    }

    @Override
    public double swim() {
        return 2;
    }
}
