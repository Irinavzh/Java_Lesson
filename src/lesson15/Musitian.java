package lesson15;

public abstract class Musitian {

    private String firstName;
    private String lastName;

    public Musitian(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void play() {
        System.out.println("My name is " + firstName + " " + lastName);
        System.out.println("I can play.");
    }
}
