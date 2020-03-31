package lesson6;

public class Main {

    public static void main(String[] args) {

        Client client1 = new Client("Ivan", "Petrov", false, 30);
        Client client2 = new Client("Petr", "Sidorov", true, 19);
        Client client3 = new Client("Alexander", "Pushkin", true, 33);

        Security security = new Security();

        String firstName1 = client1.getFirstName();
        String lastName1 = client1.getLastName();
        boolean isID1 = client1.getIsID();
        int age1 = client1.getAge();

        security.check(isID1, age1, firstName1, lastName1);

        String firstName2 = client2.getFirstName();
        String lastName2 = client2.getLastName();
        boolean isID2 = client2.getIsID();
        int age2 = client2.getAge();

        security.check(isID2, age2, firstName2, lastName2);

        String firstName3 = client3.getFirstName();
        String lastName3 = client3.getLastName();
        boolean isID3 = client3.getIsID();
        int age3 = client3.getAge();

        security.check(isID3, age3, firstName3, lastName3);

    }
}
