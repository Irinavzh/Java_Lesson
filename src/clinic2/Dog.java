package clinic2;

public class Dog {
    private String dogName;
    private String dogBreed;
    private int age;
    private int weight;

    public Dog(String dogName, String dogBreed, int age, int weight) {
        this.dogName = dogName;
        this.dogBreed = dogBreed;
        this.age = age;
        this.weight = weight;
    }

    public Dog(String dogName, int age) {
        this.dogName = dogName;
        this.age = age;
    }

    public Dog(String dogName) {
        this.dogName = dogName;
    }

//    public Dog(String dogBreed) {
//        this.dogBreed = dogBreed;
//    }

    public Dog(int age) {
        this.age = age;
    }

    public String getDogName() {
        return dogName;
    }

    public String getDogBreed() {
        return dogBreed;
    }

    public int getAge() {
        return age;
    }

    public int getWeight() {
        return weight;
    }

    public void setDogName(String dogName) {
        this.dogName = dogName;
    }

    public void setDogBreed(String dogBreed) {
        this.dogBreed = dogBreed;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }
}
