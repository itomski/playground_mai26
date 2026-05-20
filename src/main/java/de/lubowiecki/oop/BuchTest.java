package de.lubowiecki.oop;

public class BuchTest {

    public static void main(String[] args) {

        Buch b1 = new Buch();
        Buch b2 = new Buch();
        Buch b3 = new Buch();

        b1.titel = "Neuromancer";
        b1.isbn = "1234-5678-90123";
        b1.autor = "Bruce Sterling";

        System.out.println(b1.titel);
        System.out.println(b2.titel);
        System.out.println(b3.titel);

        System.out.println();
        b2.titel = "Mona Lisa Overdrive";
        System.out.println(b1.titel);
        System.out.println(b2.titel);
        System.out.println(b3.titel);

    }
}

// Darf nicht public sein
// Compiler erzeugt für jede Klasse eine eigene class-Datei
class Xyz {

}