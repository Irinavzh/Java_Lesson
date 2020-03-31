package lesson10;

public class Alg1 {

    public void sumEven(int[] massive) {
        int sum1 = 0;
        for (int i = 0; i < massive.length; i++) {
            if (massive[i] % 2 == 0) {
                sum1 = sum1 + massive[i];
            }
        }
        System.out.println(sum1);
    }

    public void check(int[] massive) {
        System.out.println("___________________");
        int even = 0;
        int odd = 0;
        for (int i = 0; i < massive.length; i++) {

            if (massive[i] % 2 == 0) {
                even = even + 1;
            } else {
                odd = odd + 1;
            }
        }
        System.out.println("For " + massive);
        System.out.println(even + " " + odd);

        if (even > odd) {
            System.out.println("Even");
        } else {
            if(even < odd) {
                System.out.println("Odd");
            } else {
                System.out.println("Even = Odd");
                }
        }

    }

//   public void polindrom(String word) {
//
//
//    }
}
