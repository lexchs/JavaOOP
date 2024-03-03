package clients.impl;

import clients.Animal;
import clients.Goable;
import clients.Owner;
import clients.Swimable;

import java.time.LocalDate;

public class Snake extends Animal implements Swimable, Goable {
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Snake() {
        this.name = "snake";
    }

    @Override
    public void eat() {
        System.out.println("Snake eat");
    }

    @Override
    public double go() {
        return 4;
    }

    @Override
    public double swim() {
        return 3;
    }
}
