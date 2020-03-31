package lesson11;

public class Client {
    private String name;
    private int age;

    public Client(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public int sum(int a, int b) {
        return a + b;
    }

    public boolean compare(String word1, String word2) {
        if (word1.equals(word2)) {
            return true;
        } else {
            return false;
        }

    }

    public void sum1(int a, int b) {
        int result = a + b;
        System.out.println(result);

    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

}
