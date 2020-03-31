package vetClinic;
import java.util.ArrayList;

public class Clinic {
    public void print(ArrayList<Dog> dogsList) {
        for (int i = 0; i < dogsList.size(); i++) {
            System.out.println(dogsList.get(i).getDogName() + ", " + dogsList.get(i).getDogBreed() + ", " +
                    dogsList.get(i).getDogAge() + "y.o.,  " + dogsList.get(i).getDogWeight() + "lb.");
        }
    }

    public void dogCheck(ArrayList<Dog> dogsList) {

        System.out.println();
        System.out.println("_______________________________________");

        for (int i = 0; i < dogsList.size(); i++) {
            if (dogsList.get(i).getDogAge() > 3 && dogsList.get(i).getDogWeight() >= 4) {
                System.out.println(dogsList.get(i).getDogName() + ", " + dogsList.get(i).getDogBreed() +
                        " - needs to be vaccinated.");
            } else {
                System.out.println(dogsList.get(i).getDogName() + ", " + dogsList.get(i).getDogBreed() +
                        " - can be discharged.");
            }
        }
    }

    public void sum(int a, int b) {
        System.out.println(a+b);
    }
}
