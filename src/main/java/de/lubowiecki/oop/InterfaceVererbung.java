package de.lubowiecki.oop;

public class InterfaceVererbung {

    public static void main(String[] args) {

        // Interface kann auch als Referenztyp genutzt werden
        Printable p1 = new WordDocument();
        p1.print();
        p1.print(10);
    }
}

// Beschreibt die öffentliche Schnittstelle
interface Printable {

    // Interfaces haben KEINE Konstruktoren

    // In einem Interface sind alle Variablen public static final
    int status = 100;

    // Alle Instanzmethoden ohne Body sind im Interface automatisch public und abstrakt
    void print();

    default void print(int page) {
        throw new UnsupportedOperationException("Noch nicht implementiert");
    }

    // Zusätzlich sind statische Methoden erlaubt - automatisch public
    static void printNull() {
        System.out.println("NULL");
    }

    // Alle Instanzmethoden mit einem Body sind default-Methoden

    // automatisch public
    default int getStaus() { // Erst seit Java 1.8 möglich
        return status;
    }
}

class WordDocument implements Printable {

    @Override
    public void print() {
        System.out.println("WordDoc wird geprintet");
    }

    // Wird eine default Methode nicht überschrieben, dann erbt die Klasse die Funktionalität

}