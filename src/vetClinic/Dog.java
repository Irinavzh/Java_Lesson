package vetClinic;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int dogAge;
    private int dogWeight;

    public Dog(String dogName, String dogBreed, int dogAge, int dogWeight) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.dogAge = dogAge;
        this.dogWeight = dogWeight;
    }

    public String getDogName() {
        return dogName;
    }
    public String getDogBreed() {
        return  dogBreed;
    }
    public int getDogAge() {
        return dogAge;
    }
    public int getDogWeight() {
        return  dogWeight;
    }
}
