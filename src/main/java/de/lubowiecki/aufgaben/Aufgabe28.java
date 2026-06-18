package de.lubowiecki.aufgaben;

import java.util.HashMap;
import java.util.Map;

public class Aufgabe28 {

    public static void main(String[] args) {

        /*
        Schreibe eine Sammlung von Schlüssel/Wert-Paaren für eine PKW-Verwalteung.
        Kennzeichen ist der Schlüssel und ein Objekt der PKW-Klasse der Wert dahinter.
        Jeder PKW hat die üblichen Angaben, wie Marke, Modell, Antriensart, Baujahr, Zustand.

        Baue eine Klein Sammlung von 5 Fahrzeugen auf und erlaube darin nach Kennzeichen zu suchen.
        Wird ein Fahrzeug gefunden, wird der PKW ausgegeben. Ansonsten eine Fehlermeldung.

        */

        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Kiel", 320_000);
        einwohner.put("Hamburg", 1_900_000);
        einwohner.put("Münster", 600_000);

        for(String key : einwohner.keySet()) {
            System.out.println(einwohner.get(key));
        }

        System.out.println();

        for(Integer v : einwohner.values()) {
            System.out.println(v);
        }

        System.out.println();

        for(Map.Entry<String, Integer> eintrag : einwohner.entrySet()) {
            System.out.println(eintrag.getKey() + ": " + eintrag.getValue());
        }

        System.out.println();

    }
}
