package de.lubowiecki.basics;

public class RecordTest {

    public static void main(String[] args) {

        Color c1 = new Color(10,0,22); // Objekt ist immutable
        Color c2 = new Color(10,0,22); // Objekt ist immutable
        Color c3 = new Color(0,0,255); // Objekt ist immutable
        System.out.println(c1); // toString ist bereits implementiert
        System.out.println(c1.rot()); // Getter sind bereits implementiert

        System.out.println(c1.hashCode()); // hashCode ist automatisch richtig überschrieben
        System.out.println(c2.hashCode());
        System.out.println(c3.hashCode());
        System.out.println(c1.equals(c2)); // equals ist automatisch richtig überschrieben
        System.out.println(c1.equals(c3)); // equals ist automatisch richtig überschrieben

    }
}

// Parameterliste beschreibt den Konstruktor
record Color(int rot, int gruen, int blau) {
}
