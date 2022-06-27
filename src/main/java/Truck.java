public class Truck extends Vehicle{
    private double load;//ladownosc
    private String type;
    public Truck (final String name, final String surname, final String licencePlate,
                                    final String brand, final String model,double load,String type) {
        super(name, surname, licencePlate, brand, model);
        this.load = load;
        this.type = type;
    }

    double getLoad() {
        return load;
    }

    void setLoad(final double load) {
        this.load = load;
    }

    String getType() {
        return type;
    }

    void setType(final String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "load=" + load +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", licencePlate='" + licencePlate + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", repairList=" + repairList +
                '}';
    }
}
