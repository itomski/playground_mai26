package de.lubowiecki.basics;

import java.util.Random;

public class FinalTest {

    private final static Random RAND = new Random();

    public static void main(String[] args) {

        // final macht eine Variable zu einer Konstante
        final double PI = 3.14;
        //PI = 3.15; // nach der ersten Wertzuweisung nicht mehr änderbar
        // Bei primitiven Datentypen darf der Wert nicht geändert werden!

        final Buch BUCH1 = new Buch();
        BUCH1.autor = "Peter Parker";

        // final für komplexe Datentypen bedeutet, dass die Referenz nicht geändert werden darf
        // Der Zustand des Objekts darf sich ändern
//        BUCH1 = null; // Nicht erlaubt
//        BUCH1 = new Buch(); // Nicht erlaubt

        // RAND = new Random();

        final boolean ok1; // Runtime-Konstante
        ok1 = true;
        while(ok1) {
            System.out.println("Ok: " + ok1);
        }

        final boolean ok2 = true; // Compile-Time-Konstante
        while(ok2) {
            System.out.println("Ok: " + ok2);
        }
        //System.out.println("ENDE"); // Compiler-Error

//        while(true) {
//        }
        //System.out.println("ENDE"); // Compiler-Error
    }
}
