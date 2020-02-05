package JavaAdvance.DefiningClasses.Exercises.p04RawData;

public class Car {
    private String model;
    private Engine engine;
    private Cargo cargo;
    private Tire[] tires;

    public Car(String model, int engineSpeed,int enginePower, int cargoWeight, String cargoType,
               double tire1pressure,int tire1age,
               double tire2pressure,int tire2age,
               double tire3pressure,int tire3age,
               double tire4pressure,int tire4age) {
        this.model = model;
        this.engine = new Engine(engineSpeed,enginePower);
        this.cargo = new Cargo(cargoWeight,cargoType);
        this.tires = new Tire[]{
                new Tire(tire1pressure,tire1age),
                new Tire(tire2pressure,tire2age),
                new Tire(tire3pressure,tire3age),
                new Tire(tire4pressure,tire4age),
        };
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModel() {
        return model;
    }

    public Cargo getCargo() {
        return cargo;
    }

    public Tire[] getTires() {
        return tires;
    }
}
