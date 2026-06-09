package de.lubowiecki.exceptions;

import java.util.Scanner;

public class InputException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Zahl: ");
            int zahl = scanner.nextInt();
            System.out.println("Deine Zahl ist " + zahl);
        }
        catch(Exception e) {
            System.out.println(e);
            System.out.println(e.getCause());
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        // Verändere dieses Programm so, dass bei einer Falschangabe ein Hinweis erfolgt und eine
        // erneute Werteingabe erfolgt.

    }
}
