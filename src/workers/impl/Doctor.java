package workers.impl;

import workers.Personal;

import java.time.LocalDate;

public class Doctor extends Personal {
    public Doctor(String name, LocalDate age, LocalDate experience, String animals_specialization, double salary) {
        super(name, age, experience, animals_specialization, salary);
    }
    public Doctor() {
        this.name = "Sasha";
    }

    @Override
    public void goOnBreak() {
    }
    @Override
    public void toWork() {
    }
    public void toDiagnose(){
    }
    public void doOperation(){
    }
}
