import java.util.ArrayList;

public class FleetOfCars {

    private final ArrayList<Car> fleet = new ArrayList<>();

    public void addCar(Car car){
        fleet.add(car);
    }

    public int getTotalRegistrationFeeForFleet(){
        int feeSum = 0;
        for (Car c: fleet) {
            feeSum += c.getRegistrationFee();
        }
        return feeSum;
    }

    @Override
    public String toString() {
        return "FleetOfCars - " +
                "Fleet: \n " + fleet;
    }
}
