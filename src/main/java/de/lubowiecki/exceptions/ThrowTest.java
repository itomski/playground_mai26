package de.lubowiecki.exceptions;

import java.io.IOException;

public class ThrowTest {

    public static void main(String[] args) {

        try {
            machWas(-175);

            System.out.println(search("Das ist das Haus von Nikigraus!", 'x'));
        }
        catch(IllegalArgumentException e) {
            System.out.println(e.getMessage());
            System.out.println("Problem 1.");
        }
        catch(RuntimeException e) {
            System.out.println(e.getMessage());
            System.out.println("Problem 2.");
        }
        catch(Exception e) {
            System.out.println(e.getMessage());
            System.out.println("Problem 3.");
        }
    }

    private static void machWas(int i) {

        if(i >= 0 && i < 100) {
            System.out.println("<");
        }
        else if(i >= 100) {
            System.out.println(">=");
        }
        else {
            throw new IllegalArgumentException("Wert ist kleiner als 0"); // Unchecked
        }
    }

    private static int search(String haystack, char needle) {

        int idx = haystack.indexOf(needle); // -1 wenn nicht gefunden

        if(idx == -1) throw new RuntimeException("Zeichen nicht gefunden");

        // throw (unbehandelt) und return beenden die Methode
        // bei throw ist ein Rückgabewert nicht nötig/möglich

        return idx;
    }
}
