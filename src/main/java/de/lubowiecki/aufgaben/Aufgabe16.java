package de.lubowiecki.aufgaben;

import java.util.ArrayList;
import java.util.List;

public class Aufgabe16 {

    /*

    Schreibe mehrere (z.B. 4) Klassen, die verschiedene Tierarten repräsentieren.
    Definiere drei Methoden (gibLaut(), bewegDichZum(String ziel), friss(String futter)), die jeweils eine Ausgabe auf der Konsole produzieren.
    Die Ausgabe soll jeweils zu der Tierart passen.

    Finde eine gemeinsame Elternklasse und überlege, welche der Methoden in die Elternklasse verschoben werden können und welche Methoden
    in der Elternklasse abstrakt sein sollten.

    Erzeuge eine Liste mit verschiedenen Tieren.
    Laufe dann die Liste Tier für Tier durch und probiere alle 3 Methoden aus.
    */

    public static void main(String[] args) {

        List<Tier> gehege = new ArrayList<>();
        gehege.add(new Katze());
        gehege.add(new Hund());
        gehege.add(new Affe());
        gehege.add(new Zebra());

        for(Tier t : gehege) {
            t.gibLaut();
            t.friss("Gurken");
            t.bewegDichZum("Zoo-Ausgang");
            System.out.println();
        }

        System.out.println();
        gibFutter(gehege, "Melone");

        System.out.println();
        gibFutter(gehege, "Stroh");

    }

    static void gibFutter(List<Tier> gehege, String futter) {
        for(Tier t : gehege) {
            t.friss(futter);
        }
    }
}

abstract class Tier {

    abstract void gibLaut();

    void bewegDichZum(String ziel) {
        System.out.println(getClass().getSimpleName() + " bewegt sich zum " + ziel);
    }

    void friss(String futter) {
        System.out.println(getClass().getSimpleName() + " frisst " + futter);
    }
}


class Hund extends Tier {

    @Override
    void gibLaut() {
        System.out.println("Wau wau!");
    }

    @Override
    void friss(String futter) {
        if(futter.equalsIgnoreCase("stroh")) {
            System.out.println("Hund: Urgh... das fresse ich nicht");
        }
        else {
            super.friss(futter);
        }
    }
}

class Katze extends Tier {

    @Override
    void gibLaut() {
        System.out.println("Miau miau!");
    }
}

class Affe extends Tier {

    @Override
    void gibLaut() {
        System.out.println("Ugh... ugh!");
    }
}

class Zebra extends Tier {

    @Override
    void gibLaut() {
        System.out.println("Yapee... yappee (soft)");
    }
}