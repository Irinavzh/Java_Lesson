package lesson15;

public class DramPlayer extends Musitian {

    public DramPlayer(String firstName, String lastName) {
        super(firstName, lastName);
    }

    @Override
    public void play() {
        System.out.println("My name is " + getFirstName() + " " + getLastName());
        System.out.println("I can play drams.");
    }
}
