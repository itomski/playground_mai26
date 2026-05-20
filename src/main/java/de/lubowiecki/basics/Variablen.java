package de.lubowiecki.basics;

public class Variablen {

    // Klassenvariable = Ab dem Laden der Klasse bis zum Ende des Programms verfügbar
    static String text;

    // Instanzvariable = gehört dem Objekt und ist so lange verfügber, solange das Objekt lebt
    String andererText;

    // Klassenmethode
    public static void machWas() {

        // Lokale Variable = Nur in dieser Methode und nur während der Ausführung verfügbar
        String ganzAndererText = "Local: machWas";
        System.out.println(ganzAndererText);

    }

    // Instanzmethode
    public void machWasAnderes() {

        // Lokale Variable
        String ganzAndererText;

    }
}
