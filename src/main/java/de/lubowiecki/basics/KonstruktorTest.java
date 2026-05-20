package de.lubowiecki.basics;

import java.time.LocalDate;

public class KonstruktorTest {

    public static void main(String[] args) {

        Person p1 = new Person("Peter", "Parker");
        Person p2 = new Person("Bruce", "Banner");
        Person p3 = new Person("Carol", "Danvers", LocalDate.now());

//        p1.vorname = "Peter";
//        p1.nachname = "Parker";
//        p1.geburtsDatum = LocalDate.now();

        System.out.println("Mein Name ist " + p1.vorname + " " + p1.nachname);


    }
}

class Person {

    String vorname;
    String nachname;
    LocalDate geburtsDatum;

    // Jede Klasse hat einen parameterlosen Default-Konstruktor solange kein eigener gebaut wurde
    // Konstruktoren heißen wie die Klasse
    // Konstruktoren haben keine Rückgabe-Typ

    Person(String v, String n) {
        vorname = v; // Parameterwerte werden in Instanzvariablen eingesetzt
        nachname = n;
    }

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        // this.vorname = Instanzvariable
        // vorname = Lokale Variable / Parameter
        // Lokale Variable überlagert die Instanzvariable
        // Instanzvariable muss über this angesprochen werden
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }
}
