package de.lubowiecki.basics;

import java.util.Scanner;

public class SwitchFinalTest {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int auswahl = scanner.nextInt(); // Statische Methoden dürfen NUR das statische Inventar der Klasse nutzen

        final int val = 1;

        // für Cases im Switch können NUR Compiletime-Konstanten verwendet werden

        switch(auswahl) {
            case val -> System.out.println("A");
            case val+1 -> System.out.println("B");
            case val+2 -> System.out.println("C");
            case val+3 -> System.out.println("D");
        }

        Buch b = new Buch();
        System.out.println(b.autor);
    }
}
