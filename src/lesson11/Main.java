package lesson11;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

         Client client1 = new Client("Ivan", 25);
         Client client2 = new Client("Petr", 45);
         Client client3 = new Client("John", 65);

         int result = client1.sum(200, 300);

        System.out.println(result * 2);
        System.out.println(client2.sum(500, 600) * 2);

   //     System.out.println(client3.sum1(20, 30) * 2);
        client3.sum1(20,30);
        System.out.println(client1.getName());

        client1.setName("Anna");
        System.out.println(client1.getName());

        Admin admin = new Admin();

       admin.print(client3);

       Client[] clients = new Client[3];
       clients[0] = client1;
       clients[1] = client2;
       clients[2] = client3;

       admin.print1(clients);
       admin.print2(clients);

        ArrayList<Client> clientsCollection = new ArrayList<>();
        clientsCollection.add(client1);
        clientsCollection.add(client2);
        clientsCollection.add(client3);

        for (int i = 0; i < clientsCollection.size(); i++) {
            String name = clientsCollection.get(i).getName();
            System.out.println(name);
        }


    }
}
