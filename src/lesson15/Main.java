package lesson15;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        Musitian pianoPlayer1 = new PianoPlayer("Ivan", "Petrov");
        Musitian saksPlayer1 = new SaksPlayer("Petr", "Ivanov");
        Musitian dramPlayer1 = new DramPlayer("Makar", "Sidorov");

        ArrayList<Musitian> musitiansList = new ArrayList<>();
        musitiansList.add(pianoPlayer1);
        musitiansList.add(saksPlayer1);
        musitiansList.add(dramPlayer1);

        for(int i = 0; i < musitiansList.size(); i++) {
            musitiansList.get(i).play();
        }

    }
}
