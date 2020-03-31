package lesson3;

public class Main2 {

    public static void main(String[] args) {

        Client client1 = new Client("Boris", "Eltsin", 85, true, 190, 56);
        Client client2;
        client2 = new Client("Egor", "Gidar", 80, true, 175, 78);

/*
       String firstName1 = client1.getFirstName();
        System.out.println(firstName1);

        String firstName2 = client2.getFirstName();
        System.out.println(firstName2);

        firstName1 = "Sam";
        System.out.println(client1.getFirstName());

        String lastName1 = client1.getLastName();
        System.out.println(lastName1);

        client1.setLastName("Ivanov");
        System.out.println(client1.getLastName());
*/
        String word1 = "Hi";
        String word2 = "Hi";
        if (word1.equals(word2)) {
            System.out.println("equal");

        }

// HOMEWORK

        client1.brakeLine();
        client1.homeWork();
        client1.brakeLine();

        Client client3 = new Client ("Donald", "Trump", 73, true, 191, 95 );
        Client client4 = new Client ("Barak", "Obama", 59, true, 185, 67);
        Client client5 = new Client ("George W", "Bush", 73, false, 182, 86);

        String firstName1 = client1.getFirstName();
        String lastName1 = client1.getLastName();
        int age1 = client1.getAge();
        boolean existID1 = client1.getExistID();
        int height1 = client1.getHeight();
        int weight1 = client1.getWeight();

        if (existID1 == true) {
            System.out.println("Client 1: " + firstName1 + " " + lastName1 + ", " + age1 + " years old, " + "has a valid ID, " + height1 + " cm, " + weight1 + "kg.");
        } else {
            System.out.println("Client 1: " + firstName1 + " " + lastName1 + ", " + age1 + " years old, " + "does NOT have a valid ID, " + height1 + " cm, " + weight1 + "kg.");
        }


        String firstName2 = client2.getFirstName();
        String lastName2 = client2.getLastName();
        int age2 = client2.getAge();
        boolean existID2 = client2.getExistID();
        int height2 = client2.getHeight();
        int weight2 = client2.getWeight();

        if (existID2 == true) {
            System.out.println("Client 2: " + firstName2 + " " + lastName2 + ", " + age2 + " years old, " + "has a valid ID, " + height2 + " cm, " + weight2 + "kg.");
        } else {
            System.out.println("Client 2: " + firstName2 + " " + lastName2 + ", " + age2 + " years old, " + "does NOT have a valid ID, " + height2 + " cm, " + weight2 + "kg.");
        }

        String firstName3 = client3.getFirstName();
        String lastName3 = client3.getLastName();
        int age3 = client3.getAge();
        boolean existID3 = client3.getExistID();
        int height3 = client3.getHeight();
        int weight3 = client3.getWeight();

        if (existID3 == true) {
            System.out.println("Client 3: " + firstName3 + " " + lastName3 + ", " + age3 + " years old, " + "has a valid ID, " + height3 + " cm, " + weight3 + "kg.");
        } else {
            System.out.println("Client 3: " + firstName3 + " " + lastName3 + ", " + age3 + " years old, " + "does NOT have a valid ID, " + height3 + " cm, " + weight3 + "kg.");
        }

        String firstName4 = client4.getFirstName();
        String lastName4 = client4.getLastName();
        int age4 = client4.getAge();
        boolean existID4 = client4.getExistID();
        int height4 = client4.getHeight();
        int weight4 = client4.getWeight();

        if (existID4 == true) {
            System.out.println("Client 4: " + firstName4 + " " + lastName4 + ", " + age4 + " years old, " + "has a valid ID, " + height4 + " cm, " + weight4 + "kg.");
        } else {
            System.out.println("Client 4: " + firstName4 + " " + lastName4 + ", " + age4 + " years old, " + "does NOT have a valid ID, " + height4 + " cm, " + weight4 + "kg.");
        }

        String firstName5 = client5.getFirstName();
        String lastName5 = client5.getLastName();
        int age5 = client5.getAge();
        boolean existID5 = client5.getExistID();
        int height5 = client5.getHeight();
        int weight5 = client5.getWeight();

        if (existID5 == true) {
            System.out.println("Client 5: " + firstName5 + " " + lastName5 + ", " + age5 + " years old, " + "has a valid ID, " + height5 + " cm, " + weight5 + "kg.");
        } else {
            System.out.println("Client 5: " + firstName5 + " " + lastName5 + ", " + age5 + " years old, " + "does NOT have a valid ID, " + height5 + " cm, " + weight5 + "kg.");
        }

        client1.setLastName("Putin");
        client1.setExistID(false);
        client1.setHeight(201);

        client2.setLastName("Medvedev");
        client2.setExistID(false);
        client2.setHeight(202);

        client3.setLastName("Clinton");
        client3.setExistID(false);
        client3.setHeight(203);

        client4.setLastName("Reagan");
        client4.setExistID(false);
        client4.setHeight(204);

        client5.setLastName("Carter");
        client5.setExistID(true);
        client5.setHeight(205);

        client1.brakeLine();
        System.out.println("Changed Parameters:");
        client1.brakeLine();


        String lastName1n = client1.getLastName();
        boolean existID1n = client1.getExistID();
        int height1n = client1.getHeight();

        if (existID1n == true) {
            System.out.println("Client 1: " + firstName1 + " " + lastName1n + ", " + age1 + " years old, " + "has a valid ID, " + height1n + " cm, " + weight1 + "kg.");
        } else {
            System.out.println("Client 1: " + firstName1 + " " + lastName1n + ", " + age1 + " years old, " + "does NOT have a valid ID, " + height1n + " cm, " + weight1 + "kg.");
        }


        String lastName2n = client2.getLastName();
        boolean existID2n = client2.getExistID();
        int height2n = client2.getHeight();

        if (existID2n == true) {
            System.out.println("Client 2: " + firstName2 + " " + lastName2n + ", " + age2 + " years old, " + "has a valid ID, " + height2n + " cm, " + weight2 + "kg.");
        } else {
            System.out.println("Client 2: " + firstName2 + " " + lastName2n + ", " + age2 + " years old, " + "does NOT have a valid ID, " + height2n + " cm, " + weight2 + "kg.");
        }

        String lastName3n = client3.getLastName();
        boolean existID3n = client3.getExistID();
        int height3n = client3.getHeight();

        if (existID3n == true) {
            System.out.println("Client 3: " + firstName3 + " " + lastName3n + ", " + age3 + " years old, " + "has a valid ID, " + height3n + " cm, " + weight3 + "kg.");
        } else {
            System.out.println("Client 3: " + firstName3 + " " + lastName3n + ", " + age3 + " years old, " + "does NOT have a valid ID, " + height3n + " cm, " + weight3 + "kg.");
        }

        String lastName4n = client4.getLastName();
        boolean existID4n = client4.getExistID();
        int height4n = client4.getHeight();

        if (existID4n == true) {
            System.out.println("Client 4: " + firstName4 + " " + lastName4n + ", " + age4 + " years old, " + "has a valid ID, " + height4n + " cm, " + weight4 + "kg.");
        } else {
            System.out.println("Client 4: " + firstName4 + " " + lastName4n + ", " + age4 + " years old, " + "does NOT have a valid ID, " + height4n + " cm, " + weight4 + "kg.");
        }

        String lastName5n = client5.getLastName();
        boolean existID5n = client5.getExistID();
        int height5n = client5.getHeight();

        if (existID5n == true) {
            System.out.println("Client 5: " + firstName5 + " " + lastName5n + ", " + age5 + " years old, " + "has a valid ID, " + height5n + " cm, " + weight5 + "kg.");
        } else {
            System.out.println("Client 5: " + firstName5 + " " + lastName5n + ", " + age5 + " years old, " + "does NOT have a valid ID, " + height5n + " cm, " + weight5 + "kg.");
        }



    }
}
