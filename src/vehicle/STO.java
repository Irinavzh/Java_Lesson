package vehicle;

import java.util.ArrayList;

public class STO {
    public void vehiclesPrint(ArrayList<Vehicles> vehiclesList) {
        System.out.println("List of Vehicles:");
        System.out.println("__________________________________");
        for(int i = 0; i < vehiclesList.size(); i++) {
            System.out.println(vehiclesList.get(i).getBrand() + ", " + vehiclesList.get(i).getYear() + ", " +
                    vehiclesList.get(i).getColor());
        }

    }
}
