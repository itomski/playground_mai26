package de.lubowiecki.aufgaben;

import java.util.Arrays;

public class Aufgabe19 {

    /*
    Schreibe ein Array mit 10 Zahlen.

    1. Suche eine Zahl in dem Array und gib die Position aus.

    2. Zeige die Zahl an einer gewünschten Position.

    Fange eventuelle Exceptions auf.
    Zeige IMMER den aktuellen Zustand des Arrays an.

    */

    public static void main(String[] args) {

        int[] zahlen = {1,2,3,4,5,6,7,8,9,10};
        int needle = 4;

        try {
            for (int i = 0; i < zahlen.length; i++) {
                if (needle == zahlen[i]) {
                    System.out.println(i);
                    break;
                }
            }
        }
        catch (RuntimeException e) {
            System.out.println("Problem!");
        }
        finally {
            System.out.println(Arrays.toString(zahlen));
        }
    }
}
