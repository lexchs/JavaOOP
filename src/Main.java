import clients.*;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Lion test1 = new Lion();
        Dog test2 = new Dog();
        Parrot test3 = new Parrot();
        Snake test4 = new Snake();
        Dolphin test5 = new Dolphin();
        Duck test6 = new Duck();
        Jiraffe test7 = new Jiraffe();
        Penguin test8 = new Penguin();
        test1.fly();
        test2.fly();
        test3.swim();
        test4.toGo();
        test4.fly();
        test5.toGo();
        test5.fly();
        test7.swim();
        test7.fly();
        test8.fly();

    }
}