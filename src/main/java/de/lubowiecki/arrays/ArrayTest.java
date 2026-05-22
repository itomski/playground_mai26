package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        int[] zahlen = {1,3,7,-1,22,-175}; // int-Array
        System.out.println(zahlen);

        byte[] andereZahlen = {10, 15, 22};
        System.out.println(andereZahlen);

        for(int i : zahlen) {
            System.out.println(i);
        }

        // Lesen
        System.out.println(zahlen[0]); // Erstes Element liegt IMMER auf 0
        System.out.println(zahlen.length); // Anzahl der Werte

        // Position MUSS gültig sein
        // Indexpositionen sind immer int
        //System.out.println(zahlen[10]); // ArrayIndexOutOfBoundsException
        //System.out.println(zahlen[-1]); // ArrayIndexOutOfBoundsException
        // Indexpositionen werden zur Laufzeit geprüft

        System.out.println();

        // Schreiben
        zahlen[0] = 1000;
        for(int i : zahlen) {
            System.out.println(i);
        }

        System.out.println();
        for(int i = 0; i < zahlen.length; i++) {
            System.out.println(zahlen[i]);
        }

        System.out.println();
        String str = Arrays.toString(zahlen);
        System.out.println(str);

        System.out.println();

        // Arrays, die mit new und einer Größe erzeugt werden, werden mit Standardwerten gefüllt
        char zeichen[] = new char[100]; // Array mit 100 Positionen
        System.out.println(Arrays.toString(zeichen));

        int a, b; // Deklariert 2 Variablen vom gleichen Typ
        int c = 10, d = 22; // Deklariert 2 Variablen vom gleichen Typ und initialisiert sie
        int[] e, f; // Deklariert 2 Variablen vom Typ int-Array
        int g, h[]; // Deklariert 2 Variablen, eine vom Typ int und die andere vom Typ int-Array

        String[] namen = new String[10]; // String-Array mit 10 Positionen
        namen[7] = "Bruce";
        namen[6] = "Carol";
        namen[7] = "Tony"; // Wert an Position wird überschrieben
        System.out.println(Arrays.toString(namen));

    }
}
