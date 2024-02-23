package clients;
import java.time.LocalDate;

public class Animal {
    protected String name;
    protected float weight;
    protected LocalDate age;
    protected Owner owner;

    public Animal(String name, float weight, LocalDate age, Owner owner) {
        this.name = name;
        this.weight = weight;
        this.age = age;
        this.owner = owner;

    }
    public Animal() {
        this("Animal",100,LocalDate.now(),new Owner());
    }
    public void live(){
        wakeUp(15);
        eat();
        play();
        sleep();
    }
    private void sleep(){
        System.out.println("The "+getType()+" is sleeping");
    }
    private void wakeUp(){
        System.out.println("The "+getType()+" woke up");
    }
    private void wakeUp(int time){
        System.out.println("The "+getType()+" woke up - in "+time);
    }
    private void eat(){
        System.out.println("The "+getType()+" is eating");
    }
    private void play(){
        System.out.println("The "+getType()+" is playing");
    }
    public void toGo(){
        System.out.println("The "+getType()+" can go");
    }
    public void fly(){
        System.out.println("The "+getType()+" can fly");
    }
    public void swim(){
        System.out.println("The "+getType()+" can swim");
    }
    public String getType(){
        return getClass().getSimpleName();
    }
    public String getName() {
        return name;
    }
    public float getWeight() {
        return weight;
    }

    public LocalDate getAge() {
        return age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String toString() {
        return String.format("Name=%s,weight=%s,age=%s,owner=$s",name,weight,age,owner);
    }
}