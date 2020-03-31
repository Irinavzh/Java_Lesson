package lesson10;

public class Main {
    public static void main(String[] args) {

        int[] array = new int[5];
        array[0] = 5;
        array[1] = 6;
        array[2] = 2;
        array[3] = 9;
        array[4] = 25;

        int[] array1 = {4, 12, 22, 5, 3, 9, 10, 24};

        Alg1 algorithm = new Alg1();
        algorithm.sumEven(array);

        algorithm.sumEven(array1);

        algorithm.check(array);
        algorithm.check(array1);
    }
}
