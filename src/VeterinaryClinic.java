import clients.Animal;
import clients.Flyable;
import clients.Goable;
import clients.Swimable;
import workers.Personal;

import java.util.ArrayList;
import java.util.List;

public class VeterinaryClinic {
    protected String clinicName;
    private List<Personal> listPersonal = new ArrayList<>();
    private List<Animal> listAnimals = new ArrayList<>();
    public VeterinaryClinic(String clinicName) {
        this.clinicName = clinicName;
        this.listAnimals = new ArrayList<>();
        this.listPersonal = new ArrayList<>();
    }
    public void addAnimal(Animal animal){
        listAnimals.add(animal);
    }
    public void addPersonal(Personal personal){
        listPersonal.add(personal);
    }
    public void removeAnimal(Animal animal){
        listAnimals.remove(animal);
    }
    public void removePersonal(Personal personal){
        listPersonal.remove(personal);
    }
    public List<Animal> getListFlyable(){
        List<Animal> flyable = new ArrayList<>();
        for (Animal animal : listAnimals){
            if (animal instanceof Flyable){
                flyable.add(animal);
            }
        }
        return flyable;
    }
    public List<Animal> getListSwimable(){
        List<Animal> swimmable = new ArrayList<>();
        for (Animal animal : listAnimals){
            if (animal instanceof Swimable){
                swimmable.add(animal);
            }
        }
        return swimmable;
    }
    public List<Animal> getListGoable(){
        List<Animal> goable = new ArrayList<>();
        for (Animal animal : listAnimals){
            if (animal instanceof Goable){
                goable.add(animal);
            }
        }
        return goable;
    }
    public List<Personal> getPersonal(){
        return listPersonal;
    }
    public List<Animal> getAnimals(){
        return listAnimals;
    }
    public double getSalary(Personal personal){
        return personal.getSalary();
    }
    public void setSalary(Personal personal, double salary){
        personal.setSalary(salary);
    }
}
