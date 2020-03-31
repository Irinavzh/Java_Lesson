package vehicle;

public class Car extends Vehicles {

    private int speed;

    public Car(String brand, int year, String color, int speed) {
        super(brand, year, color);
        this.speed = speed;
    }

    public int getSpeed() {
        return speed;
    }




}
