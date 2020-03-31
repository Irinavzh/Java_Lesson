package lesson3;

public class Client {

    private String firstName;
    private String lastName;
    private int age;
    private boolean existID;
    private int height;
    private int weight;


    public Client(String firstName, String lastName, int age, boolean existID, int height, int weight) {

        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.existID = existID;
        this.height = height;
        this.weight = weight;
    }

    public void voice() {
        System.out.println("My name is " + firstName + " " + lastName + ".");
    }

    public void voiceAge() {
        System.out.println("I am " + age + " years old.");
    }

    public void voiceHeight() {
        System.out.println("My height is " + height + "cm.");
    }

    public void voiceWeight() {
        System.out.println("My weight is " + weight + "kg.");
    }

    public void voiceID() {
        if (existID = true) {
            System.out.println(firstName + " " + lastName + " has a valid ID.");
        } else {
            System.out.println(firstName + " " + lastName + " does NOT have a valid ID.");
        }
    }


    //Creating Methods
    public void print1() {
        System.out.println("Hello World!");
    }

    public void sum1() {
        int a;
        int b;
        a = 2;
        b = 3;
        int result;
        result = a + b;
        System.out.println(result);
    }

    public void sum2(int a, int b) {
        int result = a + b;
        System.out.println(result);
    }

    public void text1(String t) {
        System.out.println(t);

    }

    public void biggerNumber(int n, int m) {
        if (n > m) {
            System.out.println(n + " is bigger then " + m);

        } else {
            System.out.println(m + " is bigger then " + n);
        }
    }

    public int sum3(int a, int b) {
        int result = a + b;
        return result;
    }

    public void compere1(String word1, String word2) {
        if (word1.equals(word2)) {
            System.out.println("Equal");

        } else {
            System.out.println("Not equal");
        }

    }

    public String compere2(int a, int b) {
        if(a == b) {

            String result3 = "Equal";
                    return  result3;
        } else {
            String result4 = "Not Equal";
            return result4;
        }
    }

    public void brakeLine() {
        String a = "__________________________";
        System.out.println(a);
    }

    public void homeWork() {
        String hw = "HOMEWORK";
        System.out.println(hw);
    }

    public int sumOfThree (int a, int b, int c) {
        int resultSum = a + b + c;
        System.out.println("Sum of numbers " + a + "+"+ b + "+" + c + " equals " + resultSum);
        return resultSum;
    }

    public int productOfThree (int x, int y, int z) {
        int resultProduct = x * y * z;
        System.out.println("Product of numbers " + x + "*"+ y+ "*" + z + " equals " + resultProduct);
        return resultProduct;
    }
// Creating Getters

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        String lastName = this.lastName;
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public boolean getExistID() {
        return existID;
    }

    public int getHeight() {
        return height;
    }

    public int getWeight() {
        return weight;
    }

    public void showFirstName () {

        String firstName3 = this.firstName;
    }


// Creating Setters
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setExistID(boolean existID) {
        this.existID = existID;
    }

    public void setHeight(int height) {
        this.height = height;
    }
}

