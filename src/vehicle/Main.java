package vehicle;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car("Acura", 2012, "Blue", 220);
        Car car2 = new Car("Honda", 2002, "Black",180);
        Car car3 = new Car("Fiat", 2015, "White", 150);
        Bus bus1 = new Bus("Caleche", 2016, "Yellow", 50);
        Bus bus2 = new Bus("BrawnAbility", 2013, "Red", 26);
        Bus bus3 = new Bus("Federal Coach", 2020, "Green", 101);

        STO sto1 = new STO();

        ArrayList<Vehicles> vehiclesList = new ArrayList<>();
        vehiclesList.add(car1);
        vehiclesList.add(car2);
        vehiclesList.add(car3);
        vehiclesList.add(bus1);
        vehiclesList.add(bus2);
        vehiclesList.add(bus3);

        sto1.vehiclesPrint(vehiclesList);


    }
}
