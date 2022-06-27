import java.util.ArrayList;
import java.util.List;

public class CarMechanicService {
    private List<Vehicle> vehicleList = new ArrayList<>();

    public void addNewCar(Vehicle vehicle) {
        vehicleList.add(vehicle);
    }

    public void printAllCars() {
        for (int i = 0; i < vehicleList.size(); i++) {
            System.out.println(vehicleList.get(i));
        }
    }
    public void addNewRepairToVehicleByLicencePlate(String licencePlate, Repair newRepair) {
        Vehicle vehicle = getVehicleByLicencePlate(licencePlate);
        vehicle.getRepairList().add(newRepair);
    }

    private Vehicle getVehicleByLicencePlate(String licencePlate) {
        for (int i = 0; i < vehicleList.size(); i++) {
            if (vehicleList.get(i).getLicencePlate().equalsIgnoreCase(licencePlate)) {
                return vehicleList.get(i);
            }
        }
        return null;
    }

    public void printCarByLicencePlate(String licencePlate) {
        System.out.println(getVehicleByLicencePlate(licencePlate));

    }
}
