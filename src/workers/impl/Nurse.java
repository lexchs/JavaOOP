package workers.impl;

import workers.Personal;

import java.time.LocalDate;

public class Nurse extends Personal {
    public Nurse(String name, LocalDate age, LocalDate experience, String animals_specialization, double salary) {
        super(name, age, experience, animals_specialization, salary);
    }
    public Nurse() {
        this.name = "Masha";
    }
    @Override
    public void goOnBreak() {
        System.out.println();
    }
    @Override
    public void toWork() {
    }
    public void assist(){
    }
    public void giveMedicine(){
    }
}
