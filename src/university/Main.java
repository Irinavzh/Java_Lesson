package university;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Ivan", "Petrov", 18, 111, 1);
        Teacher teacher1 = new Teacher("Petr", "Ivanov", 60, 222, true);
        Technician tech1 = new Technician("Makar", "Sidorov", 75, 333, true );

        ArrayList<Person> personList = new ArrayList<>();
        personList.add(student1);
        personList.add(teacher1);
        personList.add(tech1);

        tech1.uIDScreening(personList);


    }
}
