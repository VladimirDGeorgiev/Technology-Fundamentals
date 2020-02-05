package JavaAdvance.DefiningClasses.Exercises.p04RawData;

public class Tire {

    private double Pressure;
    private int age;

    public Tire(double pressure, int age) {
        Pressure = pressure;
        this.age = age;
    }

    public double getPressure() {
        return Pressure;
    }
}
