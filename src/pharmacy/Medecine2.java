package pharmacy;

import java.awt.*;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medecine2 implements Iterable<MedecineComponent> , Comparable<Medecine2>{
    private List<MedecineComponent> components;
    private int index;

    public Medecine2() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medecine2 addComponent(MedecineComponent component){
        components.add(component);
        return this;
    }
    public int getComponentsWeight(){
        int componentsWeight = 0;
        for (MedecineComponent component : components){
            componentsWeight += component.getWeight();
        }
        return componentsWeight;

    }
    public String toString(){
        return "Medecine: " + components.toString();
    }

    @Override
    public Iterator<MedecineComponent> iterator() {
        return new Iterator<MedecineComponent>() {
            @Override
            public boolean hasNext() {
                return index < components.size();
            }

            @Override
            public MedecineComponent next() {
                return components.get(index++);
            }
        };
    }

    @Override
    public int compareTo(Medecine2 medecineComponents) {
        return getComponentsWeight() - medecineComponents.getComponentsWeight();
    }
}









