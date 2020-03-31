package vehicle;

public class Vehicles {
    private String brand;
    private int year;
    private String color;

    public Vehicles(String brand, int year, String color) {
        this.brand = brand;
        this.year = year;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getColor() {
        return color;
    }

    public int getYear() {
        return year;
    }
}
