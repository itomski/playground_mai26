package de.lubowiecki.oop;

public class ObjectTest {

    public static void main(String[] args) {

        // Sammlung von Zeichenketten
        // Zusammenhang und Bedeutung unbekannt
        String[] sammlung = {"Kochen ohne Fett", "Max Mustermann", "Backen ohne Fett", "Peter Parker", "Galaktische Flugstrategien", "Tony Stark"};

        for(String str : sammlung) {
            System.out.println(str);
        }

        // Mehrere Variablen mit Zeichenketten als Inhalt
        // Zusammenhang unbekannt
        // Bedautung durch Variablennamen gegeben
        // Auf jede Variablen MUSS über ihren speziellen Namen zugegriffen werden
        var titel1 = "Kochen ohne Fett";
        var autor1 = "Max Mustermann";

        var titel2 = "Backen ohne Fett";
        var autor2 = "Peter Parker";

        var titel3 = "Galaktische Flugstrategien";
        var autor3 = "Tony Stark";

        System.out.println();

        // Inforamationen als Einheiten (Objekte)
        // Zusammenhang und Bedeutung der Informationen bekannt

        Book[] books = {
                new Book("Kochen ohne Fett", "Max Mustermann"),
                new Book("Backen ohne Fett", "Peter Parker"),
                new Book("Galaktische Flugstrategien", "Tony Stark"),
        };

        // Book ist der Datentyp der Variable
        // b ist der Name der Variable
        // books ist die Sammlung von Books
        for(Book b : books) {
            System.out.println(b.autor + ": " + b.titel);
        }
    }
}

// Objekt beschreiben, wie Informationen zusammenhängen und was sie bedeuten
// Alle Objekte einer Klasse haben die gleichen Eigenschaften.
// Der Zustand der Eigenschaften kann sich aber unterscheiden
class Book {

    String titel;
    String autor;

    public Book(String titel, String autor) {
        this.titel = titel;
        this.autor = autor;
    }
}
