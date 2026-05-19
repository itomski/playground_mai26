package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe2 {

    /*
    Schreibe ein Programm, dass nach einer Zahl (Alter) fragt.
    Danach wird die Eingabe geprüft.
    Bei Wert unter 16 kommt die Ausgabe "Zu jung"
    Bei Wert bis inkl. 100 kommt die Ausgabe "passt"
    Bei Wert über 100 kommt die Ausgabe "leider zu spät"
     */

    public static void main(String[] args) {

        // Scanner: Name der Klasse (komplexer Datentyp)
        // scanner: Name der Variable
        Scanner scanner = new Scanner(System.in);
        System.out.print("Alter: ");
        int zahl = scanner.nextInt();

        if(zahl < 0) {
            System.out.println("ungültig");
        }
        else if(zahl < 16) {
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
