package de.lubowiecki.basics;

//import java.util.Date;
import java.util.*; // Importiert alle Klassen aus dem Package
import java.util.random.*;

// Importiert das statische Inventar (Eigenschaften und Methoden) einer Klasse
import static java.lang.Math.*; // Alle statischen Eigenschaften und Methoden von Math werden importiert
import static java.lang.System.out; // Die statische Eigenschaft out wird importiert
import static java.lang.System.currentTimeMillis; // Die statische Methode wird importiert

public class PackageTest {

    public static void main(String[] args) {

        Date d1 = new Date(120, 2, 15);
        System.out.println(d1);

        // System.currentTimeMillis() = Aktueller Zeitpunkt als Timestamp
        java.sql.Date d2 = new java.sql.Date(System.currentTimeMillis());
        //java.sql.Date d2 = new java.sql.Date(currentTimeMillis()); // mit statischen import
        System.out.println(d2);

        System.out.println(de.lubowiecki.oop.DiceCup.roll());

        //RandomGenerator

        // Alle Klassen im Package java.lang sind automatisch importiert
        System.out.println(Math.PI);
        System.out.println(PI); // über statischen import eingebunden

        out.println(Math.pow(2,5));
        out.println(pow(2,5)); // über statischen import eingebunden

        out.println(Math.floor(2.275));
        out.println(floor(2.275)); // über statischen import eingebunden
    }
}
