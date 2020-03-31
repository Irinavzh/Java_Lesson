package casting;

public class Model {
    private String firstName;
    private String lastName;
    private boolean isFemale;
    private int height;
    private int weight;

    Model (String firstName, String lastName, boolean isFemale, int height, int weight) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.isFemale = isFemale;
        this.height = height;
        this.weight = weight;
    }
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public boolean getIsFemale() {
        return  isFemale;
    }
    public int getHeight() {
        return  height;
    }
    public  int getWeight() {
        return weight;
    }
}
