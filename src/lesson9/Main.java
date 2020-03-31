package lesson9;

public class Main {
    public static void main(String[] args) {
        User user1 = new User("John", "Smith", 25, true);

//        user1.setFirstName("John");

        User user2 = new User("Smith");
        User user3 = new User("Ivan", 12);
        User user4 = new User("Petr", 12);

        User[] users = new User[4];
        users[0] = user1;
        users[1] = user2;
        users[2] = user3;
        users[3] = user4;

        User.print(users);

;




    }
}
