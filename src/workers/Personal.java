package workers;

import java.time.LocalDate;

public abstract class Personal {
    protected String name;
    protected LocalDate age;
    protected LocalDate experience;
    protected String animals_specialization;
    public double salary;
    public Personal(String name, LocalDate age, LocalDate experience,String animals_specialization, double salary){
        this.name = name;
        this.age = age;
        this.experience = experience;
        this.animals_specialization = animals_specialization;
        this.salary = salary;
    }
    public Personal(){
        this("",LocalDate.now(),LocalDate.now(),"all animals",1000000);
    }

    public abstract void goOnBreak();
    public abstract void toWork();

    public String getName() {
        return name;
    }

    public LocalDate getAge() {
        return age;
    }

    public LocalDate getExperience() {
        return experience;
    }

    public String getAnimals_specialization() {
        return animals_specialization;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
    public String getType(){
        return getClass().getSimpleName();
    }

    public String toString() {
        return String.format("Name=%s,age=%s,experience=%s,animals specialization=%s,salary=%s",
                name,age,experience,animals_specialization,salary);
    }
}
