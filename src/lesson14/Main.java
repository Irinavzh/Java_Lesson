package lesson14;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Cat cat1 = new Cat("Vasya", 2, "Red");
        Dog dog1 = new Dog("Zhuchka", 10, "mops");
        Cat cat2 = new Cat("Murka", 3, "Black");
        Dog dog2 = new Dog("Belka", 5, "puddle");
        Cat cat3 = new Cat("Matilda", 8, "White");
        Dog dog3 = new Dog("Strelka", 6, "boxer");

        Clinic clinic1 = new Clinic();

        System.out.println(cat1.getName() + " " + cat1.getAge() + " " + cat1.getColor());
        System.out.println(dog1.getName() + " " + dog1.getAge() + " " + dog1.getBreed());

        ArrayList<Cat> catsList = new ArrayList<>();
        catsList.add(cat1);
        catsList.add(cat2);
        catsList.add(cat3);


        ArrayList<Dog> dogsList = new ArrayList<>();
        dogsList.add(dog1);
        dogsList.add(dog2);
        dogsList.add(dog3);


        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(cat1);
        animalsList.add(dog1);
        animalsList.add(cat2);
        animalsList.add(dog2);
        animalsList.add(cat3);
        animalsList.add(dog3);

        clinic1.catsPrint(catsList);
        clinic1.dogsPrint(dogsList);
        clinic1.animalsPrint(animalsList);
    }
}
