package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Dog extends Animal implements Swimable, Goable {
    public Dog(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }
    public Dog() {
        this.name = "dog";
    }

    @Override
    public void eat() {
        System.out.println("Dog eat");
    }
    @Override
    public double go() {
        return 7;
    }
    @Override
    public double swim() {
        return 2;
    }
}