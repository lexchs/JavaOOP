package clients.impl;

import clients.*;

import java.time.LocalDate;

public class Duck extends Animal implements Flyable, Swimable , Goable {
    public Duck(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Duck() {
        this.name = "duck";
    }
    @Override
    public void eat() {
        System.out.println("Duck eat");
    }
    @Override
    public double fly() {
        return 6;
    }

    @Override
    public double go() {
        return 3;
    }

    @Override
    public double swim() {
        return 3;
    }
}
