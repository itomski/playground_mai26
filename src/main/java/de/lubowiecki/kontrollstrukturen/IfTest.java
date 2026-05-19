package de.lubowiecki.kontrollstrukturen;

public class IfTest {

    public static void main(String[] args) {

        int i = 4;

        if(i > 5) { // Ausdruck muss IMMER boolean ergeben
            System.out.println("Kleiner 5");
        }
        else {
            System.out.println("Nicht kleiner!");
        }

        // Bei nur einer Anweisung kann auf Klammern verzichtet werden
        if(i > 5)
            System.out.println("Kleiner 5");
        else
            System.out.println("Nicht kleiner!");


        System.out.println(); // Leerzeile

        i = 50;

        if(i < 100) {
            System.out.println("Kleiner 100");
            if(i < 70) {
                System.out.println("Kleiner 70");
            }
        }
    }
}
