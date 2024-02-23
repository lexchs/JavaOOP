package clients;

import java.time.LocalDate;

public class Jiraffe extends Animal{
    public Jiraffe(String name, float weight, LocalDate age, Owner owner) {
        super(name, weight, age, owner);
    }

    public Jiraffe() {
    }
    public void swim(){
        System.out.println("The "+getType()+" can't swim");
    }
    public void fly(){
        System.out.println("The "+getType()+" can't fly");
    }
}
