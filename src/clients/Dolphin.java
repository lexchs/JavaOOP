package clients;

import java.time.LocalDate;

public class Dolphin extends Animal{
    public Dolphin(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Dolphin() {
    }
    public void toGo(){
        System.out.println("The "+getType()+" can't go");
    }
    public void fly(){
        System.out.println("The "+getType()+" can't fly");
    }
}
