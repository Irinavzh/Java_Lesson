package lesson15;

public class SaksPlayer extends Musitian {

    public SaksPlayer(String firstName, String lastName) {
        super (firstName, lastName);
    }

    @Override
    public void play() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("I can play saksophone.");
    }

}
