package less2;

import java.util.ArrayList;

public class Second {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<String>();

        animals.add("Lion");
        animals.add("Cat");
        animals.add("Dog");
        animals.add("Bird");

        ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();

        Vehicle car1 = new Vehicle("Mustang", 2000);

        Vehicle car2 = new Vehicle("Ford", 1995);

        vehicles.add(car1);
        vehicles.add(car2);

        for (Vehicle car : vehicles){
            System.out.println(car);
            System.out.println(car.getYear());
        }

    }
}
