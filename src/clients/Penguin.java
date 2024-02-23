package clients;

import java.time.LocalDate;

public class Penguin extends Animal{
    public Penguin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Penguin() {
    }
    public void fly(){
        System.out.println("The "+getType()+" can't fly");
    }
}
