package de.lubowiecki;

import java.time.LocalDate;

/**
 * Das ist einfach nur ein Beispiel für eine Klasse
 * @author Tomasz Lubowiecki
 * @version 1.0
 */
public class Basics {

    // Namenskonventionen:
        // PascalCase: Klassennamen, Interfacenamen, Enums
        // camelCase: Variablen- und Methodennamen
        // snake_case: Wird in Java NICHT verwendet
        // SCREAMING_SNAKE_CASE: öffentliche Konstanten
        // kebap-case: Wird in Java NICHT verwendet

    // Methoden sind Funktionen, die zu einer Klasse gehören

    // Einstieg in das Programm
    public static void main(String[] args) {

        // Inhalt der Methode wird von Oben nach Unten abgearbeitet

        // Variablen-Name: zahl
        // Variablen-Typ: int (Ganzzahl)
        // Initialwert: 100
        // = Zuweisung
        int zahl = 100;
        zahl = 120; // Wert wird überschrieben
        // zahl = 1.2; // Error: 1.2 ist ein double, passt nicht in ein int

        // var ist eine Verweifachung für den Entwickler
        var andereZahl = 200; // Kompiler ermittelt den Typ automatisch aus der ersten Zuweisung
        //andereZahl = 1.2;

        double d = andereZahl; // Ok

        // Ausgabe auf der Konsole
        System.out.println(andereZahl);

        // Alle Klassen aus dem Package java.lang sind ohne Import verfügbar
        System.out.println(Math.PI);

        // Klassen aus anderen Packages MÜSSEN vor der Verwendung importiert werden
        System.out.println(LocalDate.now());

        // Klassen aus dem aktuellen Package brauchen nicht importiert zu werden

        machWas(); // Aufruf der Methode

    }

    // Definition der Methode

    /**
     * Diese Methode macht garn nichts
     * @return Nichts
     */
    public static void machWas() {
        //...
    }
}

// In Java gibt es keine freien Funktionen
/*
function machWas() {
   //...
}
*/