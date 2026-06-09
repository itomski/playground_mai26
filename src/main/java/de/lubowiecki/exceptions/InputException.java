package de.lubowiecki.exceptions;

import java.util.Scanner;

public class InputException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Zahl: ");
        int zahl = scanner.nextInt();
        System.out.println("Deine Zahl ist " + zahl);

        // Verändere dieses Programm so, dass bei einer Falschangabe ein Hinweis erfolgt und eine
        // erneute Werteingabe erfolgt.

    }
}
