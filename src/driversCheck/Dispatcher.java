package driversCheck;

public class Dispatcher {

    public void check (String firstName, String lastName, int experience, boolean isDriverLicense) {
        if (isDriverLicense == true && experience > 3) {
            System.out.println(firstName + " " + lastName + ", you have permission to work.");
        } else {
            System.out.println(firstName + " "  + lastName + " you do NOT have permission to work.");

        }
    }

    public void check1(Driver driver) {
        if(driver.getIsDriverLicense() == true || driver.getExperience() > 3) {

            System.out.println(driver.getFirstName() + " " + driver.getLastName() + ", you have permission to drive.");

        } else {
            System.out.println(driver.getFirstName() + " " + driver.getLastName() + ", you do NOT have permission to drive.");
        }
    }

    public void print(String[] array) {
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public void print2(Driver[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i].getFirstName() + " " + array[i].getLastName());
        }
     }

     public void name1(Driver[] array, String name) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getFirstName().equals(name)) {
                System.out.println(array[i].getLastName());

            }
        }
     }

     public void sum(int a, int b) {
        int sum = a + b;
    }

    public void check3(Driver[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i].getIsDriverLicense() == false || array[i].getExperience() > 3) {
                System.out.println(array[i].getFirstName() + " " + array[i].getLastName() + ", you have permission to drive.");
            } else {
                System.out.println(array[i].getFirstName() + " " + array[i].getLastName() + ", you do NOT have permission to drive.");
            }
        }
    }

}
