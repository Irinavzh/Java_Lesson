package lesson3;

public class Main {
    public static void main(String[] args) {

        Client client1 = new Client("Ivan", "Petrov", 25, true, 180, 87);
        System.out.println(client1);

        Client client2 = new Client("John", "Smith", 15, false, 150, 65);
        System.out.println(client2);

        Client client3 = new Client("Donald", "Trump", 73, true, 191, 95);
        System.out.println(client3);

        Client client4 = new Client("Barak", "Obama", 59,true,185, 67);
        System.out.println(client4);

        Client client5 = new Client("George W", "Bush", 73, true,182, 86);
        System.out.println(client5);


        client1.voice();
        System.out.println();
        client1.voiceAge();
        client1.voiceHeight();
        client1.voiceID();

        client2.voice();
        client2.voiceAge();
        client2.voiceHeight();
        client2.voiceID();

        client3.voice();
        client3.voiceAge();
        client3.voiceHeight();
        client3.voiceID();

        client4.voice();
        client4.voiceAge();
        client4.voiceHeight();
        client4.voiceID();

        client5.voice();
        client5.voiceAge();
        client5.voiceHeight();
        client5.voiceID();

        client1.print1();
        client1.sum1();
        client1.sum2(124, 157);
        client1.text1("PRIVET!");
        client1.biggerNumber(125, 1025);

        client2.sum2(5, 3);
        int res = client2.sum3(7, 2);
        System.out.println(res+ 1);

        client3.compere1("true", "true1");
        String result5 = client3.compere2(6, 6);
        System.out.println(result5);

        client1.brakeLine();
        client1.homeWork();

        client4.sumOfThree(3, 4, 5);
        client5.productOfThree(3,4,5);
        client3.brakeLine();

        int r1 = client4.sumOfThree(3,4,5);
        int r2 = client5.productOfThree(3,4,5);
        System.out.println();
        System.out.println("The Sum of Sum1 and Product1 is: ");
        client1.sum2(r1, r2);

        client1.brakeLine();











    }
}
