package less4;

import java.util.ArrayList;
import java.util.Collections;

public class App {
    public static void main(String[] args) {
        ArrayList<Integer> nums = new ArrayList<Integer>();

        nums.add(20);
        nums.add(30);
        nums.add(34);

        ArrayList<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Frank", 300));
        employees.add(new Employee("Mike", 240));
        employees.add(new Employee("Paul", 500));


        Collections.sort(employees);
        
        System.out.println(employees);
    }
}
