package de.lubowiecki.kontrollstrukturen;

public class ForTest {

    public static void main(String[] args) {


        // Zähler-Variable wird deklariert und initialisiert (1x bei Start)
        // Zähler-Variable wird überprüft (bei jedem Durchlauf)
        // Zähler-Variable wird verändert (am Ende jedes Durchlaufs - nach dem Body)

        for (int i = 0; i < 100; i++) {
            System.out.println(i);
        }

        System.out.println();
        int i = 0;
        for (; i < 100;) { // 3 Blöcke müss verfügbar sein (auch wenn nicht gefüllt)
            System.out.println(i++);
        }

        System.out.println();
        //for (;;) System.out.println("Hi"); // Endlosschleife

        for (;;System.out.println("Hi")); // Endlosschleife

    }
}
