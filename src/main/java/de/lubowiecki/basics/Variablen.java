package de.lubowiecki.basics;

public class Variablen {

    // Klassenvariable = Ab dem Laden der Klasse bis zum Ende des Programms verfügbar
    static String text;

    // Instanzvariable = gehört dem Objekt und ist so lange verfügber, solange das Objekt lebt
    String andererText;

    // Klassenmethode
    public static void machWas() {

        // Methoden-Parameter sind lokale Variablen

        // Lokale Variable = Nur in dieser Methode und nur während der Ausführung verfügbar
        String ganzAndererText = "Local: machWas";
        System.out.println(ganzAndererText);

        {
            // Eine Variable ist in dem Block sichtbar, in dem sie deklariert ist
            // ... und seinen Unetrblöcken
            int i = 100;
            System.out.println(i);
        }
        //System.out.println(i); // Error: i ist hier out-of-scope

        //int i = 100; // Redeklaration im gleichen Scope - nicht erlaubt
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
        // i ist hier out-of-scope

        System.out.println("-------");

        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }
    }

    // Instanzmethode
    public void machWasAnderes() {

        // Lokale Variable
        String ganzAndererText;

    }
}
