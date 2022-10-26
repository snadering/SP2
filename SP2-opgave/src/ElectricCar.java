public class ElectricCar extends ACar{

    private final int batteryCapacity;
    private final int maxRange;

    public ElectricCar(String registrationNumber, String make, String model, int numberOfDoors , int batteryCapacity, int maxRange) {
        super(registrationNumber, make, model, numberOfDoors);
        this.batteryCapacity = batteryCapacity;
        this.maxRange = maxRange;
    }

    public int getBatteryCapacityKwh(){
        // returns the battery capacity in kilowatt-hours
        return batteryCapacity;
    }

    public int getMaxRangeKm(){
        // returns the maximum range in kilometres
        return maxRange;
    }

    public int getWhPrKm(){
        // returns the power consumption in watt hours per driven kilometre.
        return batteryCapacity * 1000 / maxRange;
    }

    @Override
    public int getRegistrationFee() {
        int kmPrLitre = (int)Math.floor(100 / (getWhPrKm() / 91.25));

        /* Jeg forstår opgaven således at bilernes ikke skal have nogen maximumværdi forbundet
           med Km/l, da elbiler oftest vurderes til at køre længere end 50km/l efter omregning.
         */
        if(kmPrLitre >= 20){
            return 330;
        } else if (kmPrLitre >= 15) {
            return 1050;
        } else if (kmPrLitre >= 10) {
            return 2340;
        } else if (kmPrLitre >= 5) {
            return 5500;
        } else{
            return 10470;
        }

    }

    @Override
    public String toString() {
        return "Electric Car - " +
                "Registration number: " + registrationNumber + '\'' +
                ", Make: " + getMake() + '\'' +
                ", Model: " + getModel() + '\'' +
                ", Max range: " + maxRange +
                ", Battery capacity: " + batteryCapacity +
                ", Number Of Doors: " + getNumberOfDoors() +
                ", Wh/Km: " + getWhPrKm() +
                ", Registration fee: " + getRegistrationFee() + '\n';


    }


}
