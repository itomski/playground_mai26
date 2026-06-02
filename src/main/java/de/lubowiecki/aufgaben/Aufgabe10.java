package de.lubowiecki.aufgaben;

import java.util.Arrays;
import java.util.Random;

public class Aufgabe10 {

    // Schreibe eine neue Version eines Würfelbechers mit 2 roll-Methoden
    // roll ohne Parameter liefert einen Wert zwischen 1 und 6 zurück
    // roll mit Parameter ( roll(10) ) liefert ein Array mit gewünschter Anzahl von Zufallswerten zwischen 1 und 6.

    public static void main(String[] args) {
        Wuerfelbecher cup = new Wuerfelbecher();
        System.out.println(cup.roll());
        System.out.println(Arrays.toString(cup.roll(10)));

        System.out.println();

        Wuerfelbecher cup2 = new Wuerfelbecher(100);
        System.out.println(cup2.roll());
        System.out.println(Arrays.toString(cup2.roll(10)));

        System.out.println();

        Wuerfelbecher cup3 = new Wuerfelbecher(20);
        System.out.println(cup3.roll());
        System.out.println(Arrays.toString(cup3.roll(10)));
        
    }
}

class Wuerfelbecher {

    private static final Random RAND = new Random();

    private int augenAnzahl;

    public Wuerfelbecher() {
        this.augenAnzahl = 6;
    }

    public Wuerfelbecher(int augenAnzahl) {
        this.augenAnzahl = augenAnzahl;
    }

    public int roll() {
        return RAND.nextInt(augenAnzahl) + 1;
    }

    public int[] roll(int anzahl) {
        int[] sammlung = new int[anzahl];
        for (int i = 0; i < sammlung.length; i++) {
            sammlung[i] = roll();
        }
        return sammlung;
    }
}
