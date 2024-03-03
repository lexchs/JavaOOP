import clients.Animal;
import clients.impl.*;
import workers.impl.Doctor;
import workers.impl.Nurse;

public class Main {
    public static void main(String[] args) {
        VeterinaryClinic clinic = new VeterinaryClinic("Dr. Doolittle");
        Lion lion = new Lion();
        Dog dog = new Dog();
        Dolphin dolphin = new Dolphin();
        Duck duck = new Duck();
        Parrot parrot = new Parrot();
        Snake snake = new Snake();
        Doctor doc = new Doctor();
        Nurse nur = new Nurse();
        clinic.addAnimal(lion);
        clinic.addAnimal(dog);
        clinic.addAnimal(dolphin);
        clinic.addAnimal(duck);
        clinic.addAnimal(parrot);
        clinic.addAnimal(snake);
        clinic.addPersonal(doc);
        clinic.addPersonal(nur);

//        System.out.println(clinic.getListFlyable());
//        System.out.println(clinic.getListSwimable());
//        System.out.println(clinic.getListGoable());

//        System.out.println(clinic.getAnimals());
//        clinic.removeAnimal(dog);
//        System.out.println(clinic.getAnimals());

//        System.out.println(clinic.getPersonal());
//        clinic.removePersonal(nur);
//        System.out.println(clinic.getPersonal());
    }
}