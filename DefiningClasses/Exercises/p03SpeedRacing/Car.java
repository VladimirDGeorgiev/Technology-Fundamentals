package JavaAdvance.DefiningClasses.Exercises.p03SpeedRacing;

public class Car {
    private String model;
    private double fuel;
    private double fuelCost;
    private int distanceTraveled;

    public Car(String model, double fuel, double fuelCost) {
        this.model = model;
        this.fuel = fuel;
        this.fuelCost = fuelCost;
        this.distanceTraveled = 0;
    }

    public String getModel() {
        return model;
    }

    public double getFuel() {
        return fuel;
    }

    public void setFuel(double fuel) {
        this.fuel = fuel;
    }

    public int getDistanceTraveled() {
        return distanceTraveled;
    }

    public void setDistanceTraveled(int distanceTraveled) {
        this.distanceTraveled = distanceTraveled;
    }

    public double getFuelCost() {
        return fuelCost;
    }

    public void travel(int amountOfKm) {
        double fuelCostForTravel = amountOfKm*this.fuelCost;
        if (fuelCostForTravel>this.fuel){
            System.out.println("Insufficient fuel for the drive");
        }else{
            setDistanceTraveled(getDistanceTraveled()+amountOfKm);
            setFuel(getFuel()-fuelCostForTravel);
        }

    }
}
