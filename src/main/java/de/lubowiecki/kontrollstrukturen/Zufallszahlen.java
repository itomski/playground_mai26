package de.lubowiecki.kontrollstrukturen;

import java.util.Random;

public class Zufallszahlen {

    public static void main(String[] args) {

        //int rand = (int)(Math.random() * 6) + 1; // jeder Cast (Typumwandlung) wird mit () geschrieben
        //int rand = (int) Math.ceil(Math.random() * 6); // jeder Cast (Typumwandlung) wird mit () geschrieben

        for (int i = 0; i < 10; i++) {
            int rand = (int)(Math.random() * 6) + 1;
            System.out.println(rand);
        }

        System.out.println();

        Random randGenerator = new Random();
        for (int i = 0; i < 100; i++) {
            int rand = randGenerator.nextInt(1, 7);
            System.out.println(rand);

            if(rand == 4) break; // break bricht die Schleife ab
        }
    }

}
