import java.util.List;

public class PassengerCar extends Vehicle{

    private double capacity;
    private String fuel;
    public PassengerCar(final String name, final String surname, final String licencePlate,
                        final String brand, final String model, double capacity, String fuel){
        super(name,surname,licencePlate,brand,model);
        this.capacity=capacity;
        this.fuel=fuel;

    }

    double getCapacity() {
        return capacity;
    }

    void setCapacity(final double capacity) {
        this.capacity = capacity;
    }

    String getFuel() {
        return fuel;
    }

    void setFuel(final String fuel) {
        this.fuel = fuel;
    }

    @Override
    public String toString() {
        return "PassengerCar{" +
                "capacity=" + capacity +
                ", fuel='" + fuel + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", repairList=" + repairList +
                '}';
    }
}
