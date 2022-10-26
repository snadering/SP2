public class GasolinCar extends AFuelCar{


    public GasolinCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre) {
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, "Gasoline");
    }


    public int getRegistrationFee() {
        if(kmPrLitre >= 20 && kmPrLitre < 50){
            return 330;
        } else if (kmPrLitre >= 15) {
            return 1050;
        } else if (kmPrLitre >= 10) {
            return 2340;
        } else if (kmPrLitre >= 5) {
            return 5500;
        } else {
            return 10470;
        }

    }



    @Override
    public String toString() {
        return "Gasoline Car - " +
                "Registration number: " + registrationNumber + '\'' +
                ", Make: " + getMake() + '\'' +
                ", Model: " + getModel() + '\'' +
                " Km/L: " + kmPrLitre +
                ", Number of doors: " + getNumberOfDoors() +
                ", Registration fee: " + getRegistrationFee() + '\n';

    }
}
