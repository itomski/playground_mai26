package de.lubowiecki.oop.fahrschule;

public class Main {

    public static void main(String[] args) {

        // Lokale Variablen haben keine Access-Modifier
        // private int i = 100; // Error!

        Pkw p1 = new Pkw("HH:AB123", "VW", "Polo", 2015);
        Pkw p2 = new Pkw("HH:XY234", "Fiat", "500", 2025, "Elektro", "Automatic");
        Pkw p3 = new Pkw();

        // Direkter Zugriff auf private Variablen nicht möglich
//        System.out.println(p1.kennzeichen);
//        p1.kennzeichen = "AB:CD345";

        System.out.println(p1.getKennzeichen()); // Lesen
        p1.setKennzeichen("AB:cd357"); // Schreiben
        System.out.println(p1.getKennzeichen()); // Lesen


//        p1 = null;
//        System.gc(); // GC wird Aufgefordert aktiv zu werden

        //Object // Mutter alles Klassen
    }
}
