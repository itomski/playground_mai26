package de.lubowiecki.aufgaben;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;

public class Aufgabe14 {

    /*
    Schreibe eine Klasse für ein Buch.
    Jedes Buch verfügt über einen autor, titel, isbn-nummer und einen preis.

    Schreibe dazu eine passende equals und hashcode Methode.
    Der Preis kann sich verändern, daher sollte der Preis beim equals nicht beachtet werden.

    Und baue eine toString-Mothode für eine "schöne" Ausgabe ein.

    Teste die Klasse anhand von 4 Büchern.
    */


    public static void main(String[] args) {

        // Set = Menge - Keine Duplikate erlaubt
        Set<Buch> buecher = new HashSet<>();

        buecher.add(new Buch("Peter Parker", "Mein Leben als Spider-Man", "1234567890", 15.99));
        buecher.add(new Buch("Bruce Banner", "Mein Leben in Grün", "34567890123", 15.99));
        buecher.add(new Buch("Peter Parker", "Mein Leben als Spider-Man", "1234567890", 15.99));

        System.out.println(buecher);

    }
}

class Buch {

    private String autor;
    private String titel;
    private String isbn;
    private double preis;

    public Buch() {
    }

    public Buch(String autor, String titel, String isbn, double preis) {
        this.autor = autor;
        this.titel = titel;
        this.isbn = isbn;
        this.preis = preis;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Buch{");
        sb.append("autor='").append(autor).append('\'');
        sb.append(", titel='").append(titel).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", preis=").append(preis);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public boolean equals(Object o) {
        System.out.println("EQUALS");
        if (o == null || getClass() != o.getClass()) return false;
        Buch buch = (Buch) o;
        return Objects.equals(autor, buch.autor) && Objects.equals(titel, buch.titel) && Objects.equals(isbn, buch.isbn);
    }

    @Override
    public int hashCode() {
        System.out.println("HASH-CODE");
        return Objects.hash(autor, titel, isbn);
    }
}
