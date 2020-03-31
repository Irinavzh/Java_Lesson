package vetClinic;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        Clinic clinic = new Clinic();

        Dog dog1 = new Dog("Lilly", "FRENCH BULLDOG", 2, 3);
        Dog dog2 = new Dog("Raquel",  "HAVANESE", 5, 6);
        Dog dog3 = new Dog("Brody", "LABRADOR RETRIEVER", 4, 2);
        Dog dog4 = new Dog("Amity", "SIBERIAN HUSKY", 10, 7);
        Dog dog5 = new Dog("Cinnabon", "GOLDEN RETRIEVER", 7, 23);

        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);
        dogsList.add(dog4);
        dogsList.add(dog5);


        clinic.print(dogsList);
        clinic.dogCheck(dogsList);

        int x = 5;
        int y = 10;

        clinic.sum(4,12);
    }
}

