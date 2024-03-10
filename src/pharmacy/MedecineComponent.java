package pharmacy;

public class MedecineComponent implements Comparable<MedecineComponent>{
    private String name;
    private float weight;
    private int power;

    public MedecineComponent(String name, float weight, int power){
        this.name = name;
        this.weight = weight;
        this.power = power;
    }

    @Override
    public String toString() {
        return "MedecineComponent{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                ", power=" + power +
                '}';
    }

    public float getWeight() {
        return weight;
    }

    @Override
    public int compareTo(MedecineComponent component) {
//        if (this.power > component.power){
//            return 1;
//        }else if (this.power == component.power){
//            return 0;
//        }else return -1;

//        return Integer.compare(this.power, component.power);

        return power - component.power;

//        return name.compareTo(component.name);

    }
}
