package university;

public class Student extends Person {
    private int mealPlan;

    public Student(String firstName, String lastName, int age, int uID, int mealPlan) {
        super(firstName, lastName, age, uID);
        this.mealPlan = mealPlan;
    }
    public int getMealPlan() {
        return mealPlan;
    }


}
