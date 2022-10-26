public abstract class AFuelCar extends ACar {

    int kmPrLitre; //km per L
    private final String fuelType;

    public AFuelCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, String fuelType) {
        super(registrationNumber, make, model, numberOfDoors);
        this.kmPrLitre = kmPrLitre;
        this.fuelType = fuelType;
    }



    public String getFuelType() { // should return “Gasoline” or “Diesel”
        return fuelType;
    }
    public int getKmPrLitre(){
        return kmPrLitre;
    } // should return how many kilometres the car can drive on 1 litre of fuel

    @Override
    public String toString() {
        return "AFuelCar{" +
                "kmPrLitre=" + kmPrLitre +
                '}';
    }
} //end class
