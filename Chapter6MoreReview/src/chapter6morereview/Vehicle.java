package chapter6morereview;

public class Vehicle {

    private final String make;
    private final String model;
    private final double gasTankCapacityInGallons;
    private final double milesPerGallonAverage;
    private double actualGasInTankInGallons;

    public Vehicle(String make, String model,
            double gasTankCapacityInGallons, double milesPerGallonAverage) {
        this.make = make;
        this.model = model;
        this.gasTankCapacityInGallons = gasTankCapacityInGallons;
        this.milesPerGallonAverage = milesPerGallonAverage;
        actualGasInTankInGallons = 0;

    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public double getGasTankCapacityInGallons() {
        return gasTankCapacityInGallons;
    }

    public double getActualGasInTankInGallons() {
        return actualGasInTankInGallons;
    }

    public double getMilesPerGallonAverage() {
        return milesPerGallonAverage;
    }

    public void addGasInGallons(double gasToAddInGallons) {
        actualGasInTankInGallons += gasToAddInGallons;

        // TODO come back to this after we talk about exceptions
        if (actualGasInTankInGallons > gasTankCapacityInGallons) {
            actualGasInTankInGallons = gasTankCapacityInGallons;
        }
    }
}
