package lesson2;

public class Main1 {

    public static void main(String[] args) {


        int age;
        age = 25;

        String name;
        name = "John";

//         if (age != 21) {
//             System.out.println("Welcome," + " " + name + "!");
//         } else {
//             System.out.println("Go Home!");
//         }
//         if (!name.equals("John")) {
//             System.out.println("Welcome," + " " + name + "!");
//         }
         if (age > 21 && name.equals("John")) {
             System.out.println("Welcome," + " " + name + "!");

         }
         if (age > 21 || name.equals("John")) {
             System.out.println("You are welcome!");

         }
         int a;
         a = 9;

         if (a % 2 == 0) {
             System.out.println("Even");

         } else {
             System.out.println("Odd");
         }

         int b;
         b = 27;
         int b1;
         b1 = b / 10;
         int b2;
         b2 = b % 10;
         int result;
         result = b1 + b2;

         System.out.println("Result = " + result);











    }
}
