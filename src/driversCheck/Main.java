package driversCheck;

import clinic.Cat;
import clinic.VetAssistant;
import org.w3c.dom.ls.LSOutput;

public class Main {
    public static void main(String[] args) {


        Driver driver1 = new Driver("Vasiliy", "Ivanov", true, 5);
        Driver driver2 = new Driver("Alexander", "Petrov", true, 2);
        Driver driver3 = new Driver("Alexey", "Grigoriev", false, 10);
        Driver driver4 = new Driver("Ivan", "Ermolov", true, 7);
        Driver driver5 = new Driver("Egor", "Antonov", false, 1);

        Dispatcher dispatcher = new Dispatcher();

        String driverFirstName1 = driver1.getFirstName();
        String driverLastName1 = driver1.getLastName();
        boolean isDriverLicense1 = driver1.getIsDriverLicense();
        int experience1 = driver1.getExperience();

        dispatcher.check(driverFirstName1, driverLastName1, experience1, isDriverLicense1);
        System.out.println();

        String oldLastName1 = driver1.getLastName();

        driver1.setLastName("Smith");
        System.out.println("The new Last Name of Mr." + oldLastName1 + " is Mr." + driver1.getLastName());
        if (isDriverLicense1 == false) {
            driver1.setIsDriverLicense(true);
            System.out.println("Mr." + driver1.getLastName() + "NOW has a Driver License.");

        }
        System.out.println();

        String driverFName1 = driver1.getFirstName();
        String driverLName1 = driver1.getLastName();
        boolean isDLicense1 = driver1.getIsDriverLicense();
        int exp1 = driver1.getExperience();

        dispatcher.check(driverFName1, driverLName1, exp1, isDLicense1);
        System.out.println();

        dispatcher.check1(driver2);
        dispatcher.check1(driver3);
        dispatcher.check1(driver4);
        dispatcher.check1(driver5);

        String name1 = driver1.getFirstName();
        String name2 = driver2.getFirstName();
        String name3 = driver3.getFirstName();
        String name4 = driver4.getFirstName();
        String name5 = driver5.getFirstName();

        String[] array1 = new String[5];
        array1[0] = name1;
        array1[1] = name2;
        array1[2] = name3;
        array1[3] = name4;
        array1[4] = name5;
        System.out.println();

        dispatcher.print(array1);

        Driver[] array2 = new Driver[5];
        array2[0] = driver1;
        array2[1] = driver2;
        array2[2] = driver3;
        array2[3] = driver4;
        array2[4] = driver5;

        dispatcher.print2(array2);
        System.out.println();
        dispatcher.name1(array2, "Egor");
        System.out.println();

        dispatcher.check3(array2);





    }
}
