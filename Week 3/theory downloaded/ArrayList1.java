package week03.theory;

import java.util.ArrayList;

public class ArrayList1 {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Toyota");
        cars.add("Daihatsu");
        cars.add("Honda");
        System.out.println("-----Checkpoint 1");
        System.out.println(cars);
        System.out.println(cars.get(0));

        cars.set(0, "Wuling");
        System.out.println("-----Checkpoint 2");
        System.out.println(cars);
        System.out.println(cars.get(0));

        cars.remove(0);
        System.out.println("-----Checkpoint 3");
        System.out.println(cars);
        System.out.println(cars.get(0));

        cars.clear();
        System.out.println("-----Checkpoint 4");
        System.out.println(cars);
    }
}
