package carsCheck;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Car("Honda Civic", 1993, "Blue", "Ivan Petrov");
        Car car2 = new Car("Hyundai Elantra", 2005, "Red", "Petr Ivanov");
        Car car3 = new Car("Nissan Sentra", 1990, "Red", "John Smith");
        Car car4 = new Car("Chevrolet Cruze", 1999, "Black", "Patrick Chen");
        Car car5 = new Car("Ford EcoSport", 2019, "Yellow", "Denis Alekseev");
        Car car6 = new Car("Kia Forte", 1990, "Green", "Ilya Kulik");
        Car car7 = new Car("Volkswagen Jetta", 1992, "White", "Evan Bayts");

        Station station1 = new Station();

        Car[] cars = new Car[7];
        cars[0] = car1;
        cars[1] = car2;
        cars[2] = car3;
        cars[3] = car4;
        cars[4] = car5;
        cars[5] = car6;
        cars[6] = car7;

        station1.print(cars);
        station1.count(cars);
        station1.station(cars);
        station1.print(cars);
        station1.count(cars);

    }
}
