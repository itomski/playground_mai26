package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class SwitchTest {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);

        System.out.print("Auswahl: ");
        // charAt liefert das Zeichen an gewünschter Position des Strings
        char c = eingabe.next().charAt(0);

        // switch verarbeitet String, ganzzahlen (ohne long), char, ENUMs
        // Andere Objekte und Fließkommazahlen sind NICHT erlaubt

        switch (c) {

            // Jeder Case MUSS einzigartig sein
            // Trifft ein case zu, wird sein Inhalt bis zum nächsten break abgearbeitet
            // Position von default ist frei wählbar

            default: // Reagiert bei anderen Werten
                System.out.println("Ungültig");
                break;

            case 'A', 'a': // Reagiert bei beiden Werten
                System.out.println("Super. Das ist klasse!");
                break;

            case 'B', 'b':
                System.out.println("Ok. Das geht!");
                break;

            case 'C', 'c':
                System.out.println("Das geht aber besser!");
                break;
        }



    }
}
