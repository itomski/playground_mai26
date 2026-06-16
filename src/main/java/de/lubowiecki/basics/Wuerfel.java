package de.lubowiecki.basics;

public class Wuerfel {

    int breite;
    int laenge;
    int hoehe;

    public Wuerfel(int breite, int laenge, int hoehe) {
        this.breite = breite;
        this.laenge = laenge;
        this.hoehe = hoehe;
    }

    public int volumen() {
        return breite * laenge * hoehe;
    }

    public static void main(String[] args) {

        Wuerfel w1 = new Wuerfel(10, 15, 22);
        System.out.println();

        Wuerfel w2 = new Wuerfel(33, 18, 17); // Neues Objekt
        System.out.println(w2.volumen());
        System.out.println();

        w2 = new Wuerfel(100, 100, 25); // Überschreiben der Referenz mit neuen Würfel
        System.out.println(w2.volumen());
        System.out.println();

        w2.breite = 25; // Ändert das vorhandene Objekt
        System.out.println(w2.volumen());
        System.out.println();

        System.out.println(w1.volumen());
    }
}
