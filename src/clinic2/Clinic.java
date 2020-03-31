package clinic2;

public class Clinic {
    public void print(Dog[] dogs) {
        System.out.println("The massive of dogs:");
        System.out.println();
        for(int i = 0; i < dogs.length; i++) {
            System.out.println(dogs[i].getDogName() + ", " + dogs[i].getDogBreed() + ", " + dogs[i].getAge() + " y.o., "
                    + dogs[i].getWeight() + " kg.");
        }
        System.out.println("______________________________");
    }
    public void clinic(Dog[] dogs) {
        System.out.println("______________________________");
        System.out.println("______________________________");
        System.out.println("The result of dogs' check:");
        System.out.println();
        for (int i = 0; i < dogs.length; i++) {
            if (dogs[i].getAge() > 3 && dogs[i].getWeight() >= 4) {
                System.out.println("Dog name: " + dogs[i].getDogName() + ", breed: " + dogs[i].getDogBreed() +
                        ", needs to be vaccinated.");
                System.out.println(dogs[i].getDogName() + " is " + dogs[i].getAge() + " years old, weight is "
                + dogs[i].getWeight() + " kg.");
                System.out.println("__________________________________");
                System.out.println();
            }
        }
    }
}