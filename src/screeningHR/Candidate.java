package screeningHR;

public class Candidate {

    private String firstName;
    private String lastName;
    private int age;
    private boolean isDiploma;
    private int experience;

    public Candidate(String firstName, String lastName, int age, boolean isDiploma, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.isDiploma = isDiploma;
        this.experience = experience;
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

    public boolean getIsDiploma() {
        return isDiploma;
    }

    public int getExperience() {
        return experience;
    }


}
