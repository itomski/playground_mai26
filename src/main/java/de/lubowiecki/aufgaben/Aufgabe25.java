package de.lubowiecki.aufgaben;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class Aufgabe25 {

    /*
    Schreibe ein Programm zu Verwaltung von Medien.
    Es gibt verschiedene Medien-Typen. Buch, Video, Musik, Hörspiel
    Erzeuge eine Liste von 10 Medien unterschhidlicher Typen.
    Schreibe ein Predicate mit dem du die Liste filtern kannst.
    Filterung soll nach:
        Medien-Typ
        Autor
        Erscheinungsjahr
    erfolgen
    */

    public static void main(String[] args) {

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Peter", "Bruce", "Carol"));

        Predicate<String> startetMitB = s -> s.startsWith("B");
        List<String> copy = new ArrayList<>(namen);
        copy.removeIf(startetMitB.negate());

        System.out.println(namen);
        System.out.println(copy);

        //namen.removeIf() // Nimmt ein Predicat entgegen
        //namen.stream().filter() // Nimmt ein Predicat entgegen

    }
}
