package clients.impl;

import clients.Animal;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Dolphin extends Animal implements Swimable {
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Dolphin() {
        this.name = "dolphin";
    }
    @Override
    public void eat() {
        System.out.println("Dolphin eat");
    }

    @Override
    public double swim() {
        return 8;
    }
}
