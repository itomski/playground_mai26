package de.lubowiecki.aufgaben;

import java.util.List;
import java.util.function.Consumer;

public class Aufgabe24 {

    // Instanzvariable
    private int zahl = 100;

    // Klassenvariable
    private static int andereZahl = 200;

    public static void main(String[] args) {

        final int ganzAndereZahl = 300; // lokale Variable

        /*
        Schreibe und Teste 4 Lamdas, die die Grundrechenarten implementieren.
        */

        MathOperation add = (a, b) -> a + b;
        MathOperation sub = (a, b) -> a - b;
        MathOperation multi = (double a, double b) -> a * b;

        MathOperation div = (a, b) -> {
            //...
            return a / b;
        };

        // Zugriff auf hier verfügbare Variablen möglich

        // ganzAndereZahl = 400; // wird geändert = nicht mehr effektiv final
        // ganzAndereZahl (lokale Variable) MUSS final oder effektiv final sein
        MathOperation irgendwas = (a, b) -> a + andereZahl + b + ganzAndereZahl;

        System.out.println(add.run(10, 15));
        System.out.println(sub.run(10, 15));
        System.out.println(multi.run(10, 15));
        System.out.println(div.run(10, 15));

        Printer p1 = (v) -> System.out.println(v + "...");
        Printer p2 = v -> System.out.println(v + "..."); // Nur bei einem Parameter möglich

        System.out.println();

        List<Integer> zahlen = List.of(10, 22, 15, 700, -20, -25, 192);
        printList(zahlen, v -> System.out.println(v * 2));

    }

//    public static void printList(List<Integer> list, Printer printer) {
//        for(Integer item : list) {
//            printer.print(item);
//        }
//    }

    public static void printList(List<Integer> list, Consumer<Integer> printer) {
        for(Integer item : list) {
            printer.accept(item);
        }
    }
}

interface MathOperation {

    double run(double a, double b);

    @Override
    String toString(); // Methode ist bereits in Objekt implementiert... hier für das SAM irrelevant

    // hashCode
    // equals
    // getClass
    // toString
    // ...
}

interface Printer {

    void print(int v);

}
