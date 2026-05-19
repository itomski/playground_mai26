package de.lubowiecki.kontrollstrukturen;

import java.util.Random;

public class Zufallszahlen {

    // Klassenvariable (static): In allen Methoden verfügbar
    static Random randGenerator = new Random();

    public static void main(String[] args) {

        // Lokale Variable, nur in dieser Methode sichtbar
        int j;

        //int rand = (int)(Math.random() * 6) + 1; // jeder Cast (Typumwandlung) wird mit () geschrieben
        //int rand = (int) Math.ceil(Math.random() * 6); // jeder Cast (Typumwandlung) wird mit () geschrieben

//        for (int i = 0; i < 10; i++) {
//            int rand = (int)(Math.random() * 6) + 1;
//            System.out.println(rand);
//        }
//
//        System.out.println();

        // Nur in der main Methode verfügbar
        //Random randGenerator = new Random();

        for (int i = 0; i < 10; i++) {
            int rand = getRand();
            System.out.println(rand);

            if(rand == 4) break; // break bricht die Schleife ab
        }
    }

    // Methode
    private static int getRand() {
        return randGenerator.nextInt(1, 7);
    }
}
