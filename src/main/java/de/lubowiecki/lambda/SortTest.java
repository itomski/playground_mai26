package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortTest {

    public static void main(String[] args) {

        // Objekte können nach der natürlichen Reihenfolge sortiert werden...
        // ... oder es wird ein Comparator vorgegeben
        // Comparator = Vergleichsobjekt

        List<Fahrzeug> fahrzeuge = new ArrayList<>();
        fahrzeuge.add(new Fahrzeug("HH:AB123", 2025, "VW", "ID.Buzz"));
        fahrzeuge.add(new Fahrzeug("B:XY123", 2015, "Renault", "Zoe"));
        fahrzeuge.add(new Fahrzeug("HH:RX227", 2010, "VW", "Polo"));
        fahrzeuge.add(new Fahrzeug("HH:RX197", 2010, "VW", "Lupo"));
        fahrzeuge.add(new Fahrzeug("M:KI993", 1999, "Mercedes", "A-Klasse"));

        System.out.println(fahrzeuge);

        Collections.sort(fahrzeuge); // Sind die Fahrzeuge vergleichbar (natürlichen Reihenfolge)?
        // Original Collection wird sortiert
        System.out.println(fahrzeuge);

        System.out.println();

        // int compare(T o1, T o2);
        Comparator<Fahrzeug> nachBaujahr = (a, b) -> a.getBaujahr() - b.getBaujahr();
        fahrzeuge.sort(nachBaujahr); // Braucht einen Comparator
        System.out.println(fahrzeuge);

        System.out.println();

        Comparator<Fahrzeug> nachMarke = (a, b) -> a.getMarke().compareTo(b.getMarke());
        fahrzeuge.sort(nachMarke); // Braucht einen Comparator
        System.out.println(fahrzeuge);

        System.out.println();

        Comparator<Fahrzeug> nachModell = (a, b) -> a.getModell().compareTo(b.getModell());
        //fahrzeuge.sort(nachModell); // Braucht einen Comparator

        // Mehrere Comparatoren gleichzeitig anwenden
        fahrzeuge.sort(nachBaujahr.thenComparing(nachMarke).thenComparing(nachModell).reversed());
        System.out.println(fahrzeuge);

    }
}

// Um eine eigene Klasse sortierbar zu machen, muss diese
// das Interface Comparable implementieren
class Fahrzeug implements Comparable<Fahrzeug> {

    private String kennzeichen;
    private int baujahr;
    private String marke;
    private String modell;

    public Fahrzeug(String kennzeichen, int baujahr, String marke, String modell) {
        this.kennzeichen = kennzeichen;
        this.baujahr = baujahr;
        this.marke = marke;
        this.modell = modell;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public String getMarke() {
        return marke;
    }

    public String getModell() {
        return modell;
    }

    @Override
    public String toString() {
        return new StringBuilder(kennzeichen)
                .append(",").append(baujahr)
                .append(", ").append(marke)
                .append(", ").append(modell)
                .toString();
    }

    // compareTo beschreibt die natürliche Reihenfolge
    // compareTo kann nur 1x pro Klasse definiert werden
    @Override
    public int compareTo(Fahrzeug other) {
        // positv = this ist größer als other
        // negativ = this ist kleiner als other
        // 0 = this und other sind gleich
        return kennzeichen.compareTo(other.kennzeichen);
    }
}