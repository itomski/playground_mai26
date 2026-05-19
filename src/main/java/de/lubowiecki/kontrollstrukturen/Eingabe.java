package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {

        // Scanner liest Eingaben aus einer Quelle ein
        // System.in = Eingabestrom
        // System.out = Ausgabestrom
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: "); // print ist Ausgabe OHNE Zeilenumbruch
        int zahl = scanner.nextInt(); // Liest eine Zahl ein
        System.out.println(zahl); // println ist Ausgabe MIT Zeilenumbruch

    }
}
