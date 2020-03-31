package carsCheck;

public class Car {

    private String model;
    private int yearCreated;
    private String color;
    private String ownerName;
    //private String power;

    public Car(String model, int yearCreated, String color, String ownerName) {
        this.model = model;
        this.yearCreated = yearCreated;
        this.color = color;
        this.ownerName = ownerName;
    }

    public String getModel() {
        return model;
    }

    public int getYearCreated() {
        return yearCreated;
    }

    public String getColor() {
        return color;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
