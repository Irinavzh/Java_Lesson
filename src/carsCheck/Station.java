package carsCheck;

public class Station {


    public void count(Car[] cars) {
        int carsRed = 0;
        for (int i = 0; i < cars.length; i++) {
            if(cars[i].getColor().equals("Red")) {
                carsRed = carsRed + 1;
            }
        }
        System.out.println("The amount of Red cars: " + carsRed);
        System.out.println("___________________________________________________");
    }

    public void print(Car[] cars) {
        System.out.println("The array of cars:");
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            System.out.println("Car #" + i + ": " + cars[i].getModel() + ", " + cars[i].getYearCreated() + ", " +
                    cars[i].getColor() + ", " + cars[i].getOwnerName());
        }
        System.out.println("__________________________________________________");
        System.out.println();
    }

    public void station(Car[] cars) {
        System.out.println("The result of Station's work:");
        System.out.println();
        for (int i = 0; i < cars.length; i++) {
            if((cars[i].getYearCreated() < 1995) && (!cars[i].getColor().equals("Red"))) {
                cars[i].setColor("Red");
                System.out.println("Car #" + i + " needs to be painted in color 'Red'");
            }
        }
        System.out.println("____________________________________________________");
        System.out.println();
    }

}
