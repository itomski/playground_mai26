package de.lubowiecki.oop;

public class InterfaceVererbung {

    public static void main(String[] args) {

        //



    }
}

// Beschreibt die öffentliche Schnittstelle
interface Printable {

    // Interfaces haben KEINE Konstruktoren

    // In einem Interface sind alle Variablen public static final
    int status = 100;

    // Alle Instanzmethoden ohne Body sind im Interface automatisch public und abstrakt
    void print();

    // Zusätzlich sind statische Methoden erlaubt - automatisch public
    static void printNull() {
        System.out.println("NULL");
    }

    // Alle Instanzmethoden mit einem Body sind default-Methoden

    // automatisch public
    default int getStaus() { // Erst seit Java 1.8 möglich
        return status;
    }
}