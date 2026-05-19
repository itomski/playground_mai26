package de.lubowiecki.kontrollstrukturen;

import java.util.Scanner;

public class WhileTest {

    public static void main(String[] args) {

        int i = 0;

        // Kopfgesteuert
        while(i > 0) { // Body wird ausgeführt, wenn true
            System.out.println(i);
            i = i - 10;
        }

        System.out.println();

        i = 0;

        // Fussgesteuert - wird mind. 1x ausgeführt
        do {
            System.out.println(i);
            i = i - 10;
        } while(i > 0);


        Scanner eingabe = new Scanner(System.in);
//        String in = eingabe.next();

//        while(!in.equals("exit")) { // solange die Eingabe NICHT "exit" lautet
//            System.out.println(in);
//            in = eingabe.next();
//        }

        String in;
        do {
            in = eingabe.next();
            System.out.println(in);
        } while(!in.equals("exit"));
    }
}
