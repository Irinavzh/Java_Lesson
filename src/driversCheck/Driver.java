package driversCheck;

public class Driver {

    private String firstName;
    private String lastName;
    private boolean isDriverLicense;
    private int experience;

    // Constructor
    public Driver(String firstName, String lastName, boolean isDriverLicense, int experience) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isDriverLicense = isDriverLicense;
        this.experience = experience;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean getIsDriverLicense() {
        return isDriverLicense;
    }
    public int getExperience() {
        return experience;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public void setIsDriverLicense(boolean isDriverLicense) {
        this.isDriverLicense = isDriverLicense;
    }

}
