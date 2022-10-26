import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        FleetOfCars myFleet = new FleetOfCars();

        Car car1 = new GasolinCar("CR79633", "Nissan", "Micra", 5, 16);
        Car car2 = new ElectricCar("AX55555", "Polestar", "2", 5,78, 470);
        Car car3 = new DieselCar("CY29731", "Toyota", "MR2", 2, 8, false);

        myFleet.addCar(car1);
        myFleet.addCar(car2);
        myFleet.addCar(car3);

        System.out.println(myFleet);
        System.out.println("Total registration fee is: " + myFleet.getTotalRegistrationFeeForFleet());


    }
}