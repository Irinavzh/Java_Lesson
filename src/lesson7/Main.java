package lesson7;

public class Main {

    public static void main(String[] args) {

        for (int i = 0; i < 5; i++) {
            System.out.println("Hello, world");
        }

        String j = "Java";
        for (int i = 0; i < 7; i++) {
            System.out.println(j);
        }

        for (int i = 1; i < 101; i++) {
            System.out.println(i);
        }

        for (int i = 1; i < 101; i++) {

            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
