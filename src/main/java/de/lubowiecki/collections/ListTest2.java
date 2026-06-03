package de.lubowiecki.collections;

import de.lubowiecki.patterns.builder.Fahrzeug;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {

    public static void main(String[] args) {

        List<Fahrzeug> parkplatz = new ArrayList<>();
        parkplatz.add(new Fahrzeug("HH:AB123", "VW", "Polo", "Blau"));
        parkplatz.add(new Fahrzeug("HH:XY776", "Renault", "Scenic", "Grau"));

        System.out.println(parkplatz);

    }
}
