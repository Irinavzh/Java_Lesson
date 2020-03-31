package lesson6;

public class Client {
    private String firstName;
    private String lastName;
    private boolean isID;
    private int age;

    public Client(String firstName, String lastName, boolean isID, int age) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.isID = isID;
        this.age = age;

    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean getIsID() {
        return isID;
    }
    public int getAge() {
        return age;
    }

}
