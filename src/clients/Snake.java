package clients;

import java.time.LocalDate;

public class Snake extends Animal{
    public Snake(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Snake() {
    }
    public void toGo(){
        System.out.println("The "+getType()+" can't go");
    }
    public void fly(){
        System.out.println("The "+getType()+" can't fly");
    }
}
