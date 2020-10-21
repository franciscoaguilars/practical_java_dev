package less3;

import java.util.Objects;

public class Animal {
    String type;
    int age;

    public Animal(String type, int age) {
        super();
        this.type = type;
        this.age = age;
    }


    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Animal)) {
            return false;
        }
        Animal animal = (Animal) o;
        return Objects.equals(type, animal.type) && age == animal.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, age);
    }
    

    


    
}
