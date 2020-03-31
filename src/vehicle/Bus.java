package vehicle;

public class Bus extends Vehicles {

    private int passNumber;

    public Bus(String brand, int year, String color, int passNumber) {
        super(brand, year, color);
        this.passNumber = passNumber;
    }

    public int getPassNumber() {
        return passNumber;
    }
}
