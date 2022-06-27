import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;
@Getter
@Setter
public abstract class Vehicle {
    protected String name;
    protected String surname;
    protected String licencePlate;
    protected String brand;
    protected String model;
    protected List<Repair> repairList = new ArrayList<>();

    Vehicle(final String name, final String surname, final String licencePlate, final String brand, final String model) {
        this.name = name;
        this.surname = surname;
        this.licencePlate = licencePlate;
        this.brand = brand;
        this.model = model;

    }


}
