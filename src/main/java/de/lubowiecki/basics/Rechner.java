package de.lubowiecki.basics;

public class Rechner {

    // privater Konstruktor verhindert die Instanzierung
    private Rechner() {
    }

    // Klassen mit statischen Methoden nennt man Utility-Klassen

    // hat die Klasse keine Instanzvariablen oder Instanzmethoden, die in der Methode Verwendung finden
    // dann kann die Methode statisch sein

    public static double add(double a, double b) {
        return a + b;
    }

    public static double sub(double a, double b) {
        return a - b;
    }

    public static double div(double a, double b) {
        return a / b;
    }

    public static double multi(double a, double b) {
        return a * b;
    }
}
