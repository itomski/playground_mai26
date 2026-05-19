package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class SwitchWochende {

    public static void main(String[] args) {

        Scanner eingabe = new Scanner(System.in);
        String tag = eingabe.next();

        // toUpperCase() = Großbuchstaben
        switch(tag.toUpperCase()) {
            case "MO":
                System.out.println("Montag");
            case "DI":
                System.out.println("Dienstag");
            case "MI":
                System.out.println("Mittwoch");
            case "DO":
                System.out.println("Donnerstag");
            case "FR":
                System.out.println("Freitag");
            case "SA", "SO":
                System.out.println("Wochenende");
                break;

            default:
                System.out.println("Ungültig");
        }
    }
}
