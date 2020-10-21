package less3;

import java.util.HashSet;

public class App {
    public static void main(String[] args) {
        HashSet<Integer> nums = new HashSet<Integer>();

        nums.add(30);
        nums.add(40);
        nums.add(50);
        nums.add(40);

        for (int n: nums){
            System.out.println(n);
        }

        Animal animal1 = new Animal("Bird", 10);
        Animal animal2 = new Animal("Bird", 10);

        System.out.println(animal1.equals(animal2));
        

    }
}
