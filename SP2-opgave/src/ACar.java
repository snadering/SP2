public abstract class ACar implements Car {

    String registrationNumber;
    private final String make;
    private final String model;
    private final int numberOfDoors;

    public ACar(String registrationNumber, String make, String model, int numberOfDoors) {
        this.registrationNumber = registrationNumber;
        this.make = make;
        this.model = model;
        this.numberOfDoors = numberOfDoors;
    }

    public String getRegistrationNumber(){
        //The number on the number plate
        return registrationNumber;
    }
    public String getMake() {
        // The make of the car e.g. Audi
        return make;
    }
    public String getModel() {
        // The model of the car e.g. A6
        return model;
    }
    public int getNumberOfDoors() {
        // The number of doors
        return numberOfDoors;
    }



}

