package lesson2;

public class Main2 {
    public static void main(String[] args) {

        //1. Check the age > 18  && ID == true
        int age;
        boolean driverID;

        age = 16;
        driverID = true;

        if ((age > 17) && (driverID == true)) {
            System.out.println("You are allowed to operate a vehicle!");
            System.out.println( "_______________");

        } else {
            System.out.println("You are not allowed to operate a vehicle!");
            System.out.println( "_______________");
        }


        //2. Find the bigger number
        int a1;
        int a2;
        a1 = 705;
        a2 = 705;

        if (a1 > a2) {
            System.out.println(a1 + " is the greater number.");
            System.out.println(a1 + " > " + a2);
            System.out.println( "_______________");
        } else
            if (a1 < a2) {
                System.out.println(a2 + " is the greater number.");
                System.out.println(a2 + " > " + a1);
                System.out.println("_______________");
            } else {
            System.out.println(a1);
            System.out.println("Numbers are equal.");
            System.out.println(a1 + " = " + a2);
            System.out.println("_______________");
        }

        //3. Check the number - negative or positive.
        int a;
        a = 13;
        if (a > 0) {
            System.out.println(a + " is a positive number.");
            System.out.println( "_______________");
        } else
        if (a < 0) {
            System.out.println(a + " is a negative number.");
            System.out.println( "_______________");
        } else

        {
            System.out.println("Zero is neither positive nor negative.");
            System.out.println( "_______________");
        }

        //4. Check the number - odd or even.
        int d;
        d = 0;
        if (d % 2 == 1) {
            System.out.println(d + " " + "is an odd number.");
        } else  {
            System.out.println(d + " " + "is an even number.");
        }


    }
}
