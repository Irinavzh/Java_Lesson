package lesson14;

import java.util.ArrayList;

public class Clinic {
    public void catsPrint(ArrayList<Cat> catsList) {
        System.out.println();
        System.out.println("Cats:");
        System.out.println("______________________");
        for (int i = 0; i < catsList.size(); i++) {
            System.out.println(catsList.get(i).getName() + ", " + catsList.get(i).getAge() + ", " + catsList.get(i).getColor());
        }
    }

    public void dogsPrint(ArrayList<Dog> dogsList) {
        System.out.println();
        System.out.println("Dogs:");
        System.out.println("______________________");
        for (int i = 0; i < dogsList.size(); i++) {
            System.out.println(dogsList.get(i).getName() + ", " + dogsList.get(i).getAge() + ", " + dogsList.get(i).getBreed());
        }
    }

    public void animalsPrint(ArrayList<Animal> animalList) {
        System.out.println();
        System.out.println("List og Animals, who need to be vaccinated:");
        System.out.println("_______________________");
        for(int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getAge() > 3) {
                System.out.println(animalList.get(i).getName() + " needs to be vaccinated.");
            } else {
                System.out.println(animalList.get(i).getName() + " can go home.");
            }
        }

    }
}
