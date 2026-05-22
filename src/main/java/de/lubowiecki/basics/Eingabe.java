package de.lubowiecki.basics;

import java.util.Scanner;

public class Eingabe {

    final static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        app: while(true) {
            System.out.print("Input: ");
            //String eingabe = scanner.next(); // Liest nur bis zum ersten Leerzeichen
            String eingabe = scanner.nextLine(); // Liest die komplette eingabe ein

            switch(eingabe.trim().toLowerCase()) {

                case "neu" -> System.out.println("Neues Objekt");
                case "print" -> System.out.println("Ausgabe");
                case "edit" -> System.out.println("Ändern");
                case "delete" -> System.out.println("Löschen");
                case "exit" -> {
                    break app;
                }
                default -> System.out.println("Ungültig");
            }

            //if(eingabe.equalsIgnoreCase("exit")) break app; // Bricht die Schleife ab
            //System.out.println(eingabe);
        }

        System.out.println("ENDE");

    }
}
