import pharmacy.Medecine2;
import pharmacy.MedecineComponent;
import pharmacy.impl.Albendazola;
import pharmacy.impl.Asitromin;
import pharmacy.impl.Penicilin;
import pharmacy.impl.Vetbicid;

import java.util.*;

public class Main {
    public static void main(String[] args) {
//        VeterinaryClinic clinic = new VeterinaryClinic("Dr. Doolittle");
//        Lion lion = new Lion();
//        Dog dog = new Dog();
//        Dolphin dolphin = new Dolphin();
//        Duck duck = new Duck();
//        Parrot parrot = new Parrot();
//        Snake snake = new Snake();
//        Doctor doc = new Doctor();
//        Nurse nur = new Nurse();
//        clinic.addAnimal(lion);
//        clinic.addAnimal(dog);
//        clinic.addAnimal(dolphin);
//        clinic.addAnimal(duck);
//        clinic.addAnimal(parrot);
//        clinic.addAnimal(snake);
//        clinic.addPersonal(doc);
//        clinic.addPersonal(nur);

//        System.out.println(clinic.getListFlyable());
//        System.out.println(clinic.getListSwimable());
//        System.out.println(clinic.getListGoable());

//        System.out.println(clinic.getAnimals());
//        clinic.removeAnimal(dog);
//        System.out.println(clinic.getAnimals());

//        System.out.println(clinic.getPersonal());
//        clinic.removePersonal(nur);
//        System.out.println(clinic.getPersonal());

        ArrayList<Medecine2> medArr2 = new ArrayList<>();

        MedecineComponent asitromin = new Asitromin("Asitro",50,70);
        Penicilin penicilin = new Penicilin("Penicilin", 30,50);
        Vetbicid vetbicid = new Vetbicid("Vetbicid",40,30);
        Albendazola alben = new Albendazola("Albendazola",10,150);

        Medecine2 medecine1 = new Medecine2();
        Medecine2 medecine2 = new Medecine2();
        Medecine2 medecine3 = new Medecine2();
        Medecine2 medecine4 = new Medecine2();

        medecine1.addComponent(asitromin).addComponent(penicilin);
        medecine2.addComponent(vetbicid).addComponent(alben);
        medecine3.addComponent(asitromin).addComponent(vetbicid);
        medecine4.addComponent(penicilin).addComponent(alben);

        medArr2.add(medecine1);
        medArr2.add(medecine2);
        medArr2.add(medecine3);
        medArr2.add(medecine4);

        System.out.println(medArr2);
        Collections.sort(medArr2);
        System.out.println(medArr2);
    }
}












