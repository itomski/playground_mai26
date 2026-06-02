package de.lubowiecki.api;

public class SystemTest {

    public static void main(String[] args) {

        // System = Klasse
        // out = statisches Attribut der Klasse System
            // out ist ein PrintStream-Objekt (Standard Ausgabestrom)
        // println = Methode
        System.out.println("Moin");

        // err ist ein PrintStream-Objekt (Ausgabestrom für Fehler und Exceptions)
        System.err.println("Moin");

        // System.in
            // wird z.B. vom Scanner benutzt
            // in ist ein InputStream-Objekt (Eingabestrom)


        System.gc(); // Bitte zum Start des GarbageCollectors

        long start = System.currentTimeMillis();

        for (int i = 0; i < 100_000; i++) {
            System.out.println(i);
        }

        long ende = System.currentTimeMillis();
        System.out.println(ende - start + "ms");

        System.out.println();

        System.out.println(System.getProperties());
        System.out.println(System.getProperty("user.home"));
        System.out.println(System.getProperty("os.name"));

        System.exit(0);

        System.out.println("ENDE");
    }
}
