package university;

public abstract class Person {

    private String firstName;
    private String lastName;
    private int age;
    private int uID;

    public Person (String firstName, String lastName, int age, int uID) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.uID = uID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }
    public int getuID() {
        return uID;
    }

}
