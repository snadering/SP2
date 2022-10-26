public class DieselCar extends AFuelCar{

    boolean particleFilter;

    public DieselCar(String registrationNumber, String make, String model, int numberOfDoors, int kmPrLitre, boolean particleFilter){
        super(registrationNumber, make, model, numberOfDoors, kmPrLitre, "Diesel");
       this.particleFilter = particleFilter;
    }

    public boolean hasParticleFilter(){
        return particleFilter;
    }

    public int getRegistrationFee() {
        int fee = 0;
        if (!hasParticleFilter()) fee = 1000;
        if(kmPrLitre >= 20 && kmPrLitre < 50){
            return 330 + 130 + fee;
        } else if (kmPrLitre >= 15 && kmPrLitre < 20) {
            return 1050 + 1390 + fee;
        } else if (kmPrLitre >= 10 && kmPrLitre < 15) {
            return 2340 + 1850 + fee;
        } else if (kmPrLitre >= 5 && kmPrLitre < 10) {
            return 5500 + 2770 + fee;
        } else {
            return 10470 + 15260 + fee;
        }


    }


    @Override
    public String toString() {
        return "Diesel Car - " +
                "Registration number: " + registrationNumber + '\'' +
                ", Make: " + getMake() + '\'' +
                ", Model: " + getModel() + '\'' +
                ", Km/L: " + kmPrLitre +
                ", Number of doors: " + getNumberOfDoors() +
                ", Has particle filter: " + hasParticleFilter() +
                ", Registration fee: " + getRegistrationFee() + '\n';
    }
}
