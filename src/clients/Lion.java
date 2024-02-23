package clients;

import java.time.LocalDate;

public class Lion extends Animal{
    public Lion(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Lion() {
        super();
    }
    public void fly(){
        System.out.println("The "+getType()+" can't fly");
    }
}
