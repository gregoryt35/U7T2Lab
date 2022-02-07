public class Car {
    private String model;
    private int numMiles;

    public Car(String model, int numMiles) {
        this.model = model;
        this.numMiles = numMiles;
    }

    public String toString() {
        return model + " " + numMiles + "mi";
    }
}
