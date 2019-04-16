package Objectandclass.VehicleCatalogue;

public class Vehicle {
    private String type;
    private String model;
    private String color;
    private int horsePower;

    public Vehicle(String type, String model, String color, int horsePower) {
        this.type = type;
        this.model = model;
        this.color = color;
        this.horsePower = horsePower;
    }

    public String getModel() {
        return this.model;
    }

    public String getType() {
        return this.type;
    }

    public String getColor() {
        return this.color;
    }

    public int getHorsePower() {
        return this.horsePower;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return String.format("Type: %s\n" +
                             "Model: %s\n" +
                             "Color: %s\n" +
                             "Horsepower: %d",
                                this.getType().toUpperCase().charAt(0)+ this.getType().substring(1) ,
                                this.getModel()
                                ,this.getColor(),
                                this.getHorsePower());
    }
}
