package lesson7;

public class Main1 {
    public static void main(String[] args) {

        int[] array1 = new int[6];

        array1[0] = 7;
        array1[1] = -2;
        array1[2] = 5;
        array1[3] = 9;
        array1[4] = 35;
        array1[5] = 1000;

        int size = array1.length;
        System.out.println(size);

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i]< 0) {
                System.out.println(array1[i]);

            }
        }
        System.out.println();

        for (int i = 0; i < array1.length; i++) {
            if (array1[i] % 2 == 1) {
                System.out.println(array1[i]);
            }
        }

        System.out.println();


        int storage = array1[0];
        array1[0] = array1[array1.length - 1];
        array1[array1.length - 1] = storage;

        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);

        }

    }
}
