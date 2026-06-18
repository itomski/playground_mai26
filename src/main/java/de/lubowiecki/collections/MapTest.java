package de.lubowiecki.collections;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class MapTest {

    public static void main(String[] args) {

        // Maps = Schlüssel/Wert-Paare

        Map<LocalDate, String> termine = new HashMap<>();
        termine.put(LocalDate.now(), "Essen mit Peter");
        termine.put(LocalDate.of(2026, 10, 5), "Essen mit Carol");
        termine.put(LocalDate.of(2026, 7, 3), "Projektmeeting");
        termine.put(LocalDate.of(2026, 8, 1), "Essen mit Bruce");

        System.out.println(termine);
        System.out.println(termine.getOrDefault(LocalDate.now().plusDays(1), "Leer"));

        System.out.println();

        Map<Integer, String> statusCodes = new HashMap<>();
        statusCodes.put(1, "Alles Ok");
        statusCodes.put(2, "Bisschen kaputt");
        statusCodes.put(3, "Ganz doll kaputt");
        statusCodes.put(4, "Keine Angabe");

        int code = 2;

        System.out.println(statusCodes.getOrDefault(code, "Unbekannt"));

        System.out.println();

        System.out.println(System.getProperty("java.class.path"));
        System.out.println(System.getProperties());
    }
}
