package university;

import java.util.ArrayList;

public class Technician extends Person {
    private boolean isCash;

    public Technician(String firstName, String lastName, int age, int uID, boolean isCash) {
        super(firstName, lastName, age, uID);
        this.isCash = isCash;
    }
    public boolean getIsCash() {
        return isCash;
    }

    public void uIDScreening (ArrayList<Person> personList) {
        for (int i = 0; i < personList.size(); i++) {
            if (personList.get(i).getuID() == 111 || personList.get(i).getuID() == 222 || personList.get(i).getuID() == 333 ) {
                System.out.println(personList.get(i).getFirstName() + " " + personList.get(i).getLastName() + ", welcome to Cafeteria!");
            } else {
                System.out.println("Sorry, you are not allowed to buy meal.");
            }
        }
    }

}