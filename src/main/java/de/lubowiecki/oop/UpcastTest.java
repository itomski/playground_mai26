package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class UpcastTest {

    public static void main(String[] args) {

        // String IS-A Object
        Object obj1 = "Moin";

        // Integer IS-A Object
        Object obj2 = 123;

        // ArrayList IS-A List
        List<String> liste = new ArrayList<>();

        liste.add("Moin");

        // ArrayList IS-A Object
        //Object obj3 = new ArrayList<>();
        Object obj3 = liste;
        // obj3.add("Moin"); // Error: Über eine Referenz können nur die Möglichkeiten den Referenz-Typs genutzt werden
        ((ArrayList)obj3).add("Moin"); // Referenz kann auch wieder durch ein Cast erweitert werden


        // IS-A: Wird durch vererbung realisiert
        // HAS-A: Wird durch eine Eingenschaft vom Refeneztyp realisiert

        Bewegbar b1 = new PKW(); // PKW IS-A Fahrzeug und Fahrzeug IS-A Bewegbar
        b1 = new LKW(); // LKW IS-A Fahrzeug und Fahrzeug IS-A Bewegbar
        b1.bewegenAnPos(100, 200);

    }
}

class Fahrzeug implements Bewegbar {
    String kennzeichen;

    // Das Implementieren eines Interface verpflichtet die Klasse alle abstrakten Methoden zu realisieren
    @Override
    public boolean bewegenAnPos(int x, int y) {
        return false;
    }
}

// PKW IS-A Fahrzeug
class PKW extends Fahrzeug {
    // kennzeichen ist im PKW verfügbar

    Antrieb antrieb; // PKW HAS-A Antrieb
}

// LKW IS-A Fahrzeug
class LKW extends Fahrzeug {
    // kennzeichen ist im LKW verfügbar

    // LKW kann auf kennzeichen aus der Elternklasse zugreifen
    // Fahrzeug (Elternklasse) kann NICHT auf ladung zugreifen!
    List<String> ladung = new ArrayList<>();
}

class Antrieb {

}

interface Bewegbar {

    // Abstrakte Methode
    boolean bewegenAnPos(int x, int y);

}