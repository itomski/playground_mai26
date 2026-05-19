package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class Eingabe {

    public static void main(String[] args) {

        // Scanner liest Eingaben aus einer Quelle ein
        // System.in = Eingabestrom
        // System.out = Ausgabestrom
        Scanner scanner = new Scanner(System.in);

        System.out.print("Eingabe: "); // print ist Ausgabe OHNE Zeilenumbruch

        // Scanner liest eine Zahl von der Konsole ein
        // und weist sie einer Variable zu
        int zahl = scanner.nextInt();

        System.out.println(zahl); // println ist Ausgabe MIT Zeilenumbruch

        if(zahl < 16) {
            System.out.println("zu jung");
        }
        else if(zahl > 100){
            System.out.println("zu spät");
        }
        else {
            System.out.println("passt");
        }
    }
}
