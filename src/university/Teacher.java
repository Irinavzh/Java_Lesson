package university;

public class Teacher extends Person  {
    private boolean isCredit;

    public Teacher (String firstName, String lastName, int age, int uID, boolean isCredit) {
        super(firstName, lastName, age, uID);
        this.isCredit = isCredit;
    }

    public boolean getIsCredit() {
        return isCredit;
    }

}
