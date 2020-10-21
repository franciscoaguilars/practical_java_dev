package less4;

public class Employee implements Comparable<Employee>{
    String name;
    int salary;


    public Employee(String name, int salary) {
        this.name = name;
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "{" +
            " name='" + name + "'" +
            ", salary='" + salary + "'" +
            "}";
    }
    


    @Override
    public int compareTo(Employee o) {
        if (this.salary < o.salary){
            return -1;
        } else if(this.salary > o.salary){
            return 1;
        }
        return 0;
    }


}
