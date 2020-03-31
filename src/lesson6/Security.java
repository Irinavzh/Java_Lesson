package lesson6;

public class Security {

    public void check(boolean isID, int age, String firstName, String lastName) {
        if (isID == false) {
            System.out.println("Dear " + firstName + " " + lastName + ", sorry, go home! You do not have an ID.");

        } else {
            if (age < 21) {
                System.out.println("Dear " + firstName + " " + lastName + ", sorry, go home! You are not old enough.");
            } else {
                System.out.println("Dear " + firstName + " " + lastName + ", welcome to the Club!");
            }
        }

    }


}