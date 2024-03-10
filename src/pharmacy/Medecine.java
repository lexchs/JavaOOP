package pharmacy;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Medecine implements Iterator<MedecineComponent> {
    private List<MedecineComponent> components;
    private int index;

    public Medecine() {
        this.components = new ArrayList<>();
        this.index = 0;
    }
    public Medecine addComponent(MedecineComponent component){
        components.add(component);
        return this;
    }

    @Override
    public boolean hasNext() {
        return index < components.size();
    }

    @Override
    public MedecineComponent next() {
        return components.get(index++);
    }
    public String toString(){
        return "Medecine: " + components.toString();
    }
}
