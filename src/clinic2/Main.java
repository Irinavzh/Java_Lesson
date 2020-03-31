package clinic2;

public class Main {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Lilly", "FRENCH BULLDOG", 2, 3);
        Dog dog2 = new Dog("Amber", 1);
        Dog dog3 = new Dog("Cinnabon");
        Dog dog4 = new Dog("Raquel", "HAVANESE", 5, 6);
        Dog dog5 = new Dog(8);
        Dog dog6 = new Dog("Brody", "LABRADOR RETRIEVER", 4, 2);
        Dog dog7 = new Dog("Amity", "SIBERIAN HUSKY", 10, 7);

        Clinic clinic1 = new Clinic();

        Dog[] dogs = new Dog[7];
        dogs[0] = dog1;
        dogs[1] = dog2;
        dogs[2] = dog3;
        dogs[3] = dog4;
        dogs[4] = dog5;
        dogs[5] = dog6;
        dogs[6] = dog7;

        clinic1.print(dogs);

        dog2.setDogBreed("DACHSHUND");
        dog2.setWeight(2);
        dog3.setDogBreed("GOLDEN RETRIEVER");
        dog3.setAge(4);
        dog3.setWeight(4);
        dog5.setDogName("Mojo");
        dog5.setDogBreed("HAVAPOO");
        dog5.setWeight(7);

        clinic1.print(dogs);
        clinic1.clinic(dogs);
    }
}
