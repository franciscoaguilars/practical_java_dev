package less2;


public class Vehicle {
    String model;
    int year;

    public Vehicle(String model, int year){
        this.model = model;
        this.year = year;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }
}
