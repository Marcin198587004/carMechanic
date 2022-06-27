import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        Truck truck = new Truck("TestName", "surname", "Wj98778", "Mercedes", "Actros", 16000, "patelnia");
        PassengerCar passengerCar = new PassengerCar("test2", "surname2", "wh7689", "Volvo", "S40", 1599, "Diesel");
        CarMechanicService service = new CarMechanicService();
        service.addNewCar(truck);
        service.addNewCar(passengerCar);

        Repair repair=new Repair("wymiana opon",300, LocalDate.now());
        service.addNewRepairToVehicleByLicencePlate("Wj98778",repair);
        service.printCarByLicencePlate("wj98778");
    }
}

