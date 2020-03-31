package lesson13;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> array1 = new ArrayList<>();

        array1.add(7);
        array1.add(12);
        array1.add(35);
        array1.add(50);
        array1.add(93);
        array1.add(100);
        array1.add(135);

        int size = array1.size();
        System.out.println(size);

        int a = array1.get(0);
        System.out.println(a);


        for (int i = 0; i < array1.size(); i++) {

            System.out.print(array1.get(i) + " ");
        }

        System.out.println();

        ArrayList<String> word1 = new ArrayList<>();
        word1.add("John");
        word1.add("Julia");
        word1.add("Matthew");
        word1.add("Anthony");
        word1.add("Audrey");
        word1.add("John");

        for (int i = 0; i < word1.size(); i++) {
            System.out.print(word1.get(i) + " ");
        }
        System.out.println();

        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 2 == 0) {
                System.out.print(array1.get(i) + " ");
            }
        }

        System.out.println();

        int sum = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 2 == 0) {
                sum = sum + array1.get(i);

            }
        }
        System.out.println(sum);

        int odd = 0;
        int even = 0;
        for (int i = 0; i < array1.size(); i++) {
            if (array1.get(i) % 2 == 0) {
                even = even + 1;
            } else odd = odd + 1;
        }
        if (even > odd) {
            System.out.println("EVEN");
        } else {
            System.out.println("ODD");
        }

        System.out.println();

        int johns = 0;
        for (int i = 0; i < word1.size(); i++) {
            if (word1.get(i).equals("John")) {
                johns++;
            }
        }
        System.out.println(johns);


    }
}

