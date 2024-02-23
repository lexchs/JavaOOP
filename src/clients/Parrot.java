package clients;

import java.time.LocalDate;

public class Parrot extends Animal{
    public Parrot(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Parrot() {
    }
    public void swim(){
        System.out.println("The "+getType()+" can't swim");
    }
}
