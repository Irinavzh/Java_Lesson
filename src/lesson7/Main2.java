package lesson7;

public class Main2 {

    public static void main(String[] args) {

        String[] array1 = new String[7];

        array1[0] = "Buy";
        array1[1] = "Hi";
        array1[2] = "Hello";
        array1[3] = "Good Morning";
        array1[4] = "Hello";
        array1[5] = "See you";
        array1[6] = "Hello";

        int count = 0;
        for (int i = 0; i < array1.length; i++) {
            if (array1[i].equals("Hello")) {
                count = count + 1;
            }
        }
        System.out.println("I found " + count + " worlds 'Hello'.");

    }
}
