package lesson11;

public class Admin {
    public void print(Client c) {
        System.out.println(c.getName() + " " + c.getAge());
    }

    public void print1(Client[] customers) {
        for (int i = 0; i < customers.length; i++) {
            if (customers[i].getAge() > 30) {
                System.out.println(customers[i].getName());
            }
        }

    }

    public void print2(Client[] customers) {
        for (int i = 0; i < customers.length; i++) {

            System.out.println(customers[i].getName() + " was born in " + (2020 - customers[i].getAge()));
        }

    }
}
