package de.lubowiecki.basics;

public class BuchTest {

    public static void main(String[] args) {

        // Kein Import nötig, da Buch im gleichen Package

        // Komplexer Datentyp = Basiert auf einer Klasse
        Buch b1 = new Buch(); // "new" baut aus dem Bauplan (Klasse) ein neues Buch-Objekt
        System.out.println(b1.autor); // null
        System.out.println(b1.titel); // null

        b1.autor = "Peter Parker"; // Wert wird zugewiesen
        b1.titel = "Mein Leben als Spider-Man"; // Wert wird zugewiesen
        System.out.println(b1.autor); // null
        System.out.println(b1.titel);

        // primitiver Datentyp: Basiert NICHT auf einer Klasse
        int i = 10;
        // primitiv = nur Belegen mit einem Wert und Abfragen des Wertes möglich
    }
}
