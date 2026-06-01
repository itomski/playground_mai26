package de.lubowiecki.aufgaben.loesungen;

import de.lubowiecki.basics.Buch;

import java.util.Random;
import java.util.Scanner;

public class LoesungA9 {

    private static final int ROWS = 10;
    private static final int COLS = 10;
    private static final int MAX_ATTEMPTS = 10;
    private static final int MUSHROOMS = 10;

    private static final Random RAND = new Random();
    private static final Scanner scanner = new Scanner(System.in);

    private static int[][] board;
    private static int count = 0;
    private static int pickupCount = 0;

    public static void main(String[] args) {

        // Spielfeld zum Verwalten der Pilze
        // Zufällige Verteilung der Pilze
        // Usereingabe (UI)
        // Prüfung der Eingabe
        // Auswertung

        resetMushrooms();
        printBoard();

        System.out.println("Spiel wird gestartet!");

        while(count < MAX_ATTEMPTS) {

            // TODO: Validierung und Exceptionhandling
            System.out.print("x: ");
            int selectedRow = scanner.nextInt();
            System.out.print("y: ");
            int selectedCol = scanner.nextInt();

            if(board[selectedRow][selectedCol] == 1) {
                System.out.println("Treffer!");
                pickupCount++;
                board[selectedRow][selectedCol] = 2; // Pilz als eingesammelt markieren
                // TODO: Pilz als gefunden markieren
            }
            else if(board[selectedRow][selectedCol] == 2) {
                System.out.println("Bereits eingesammelt!");
                continue; // Springt sofort zum nächsten durchlauf der Schleife ohne den count weiterzuzählen
            }
            else {
                System.out.println("Kein Treffer! Sorry.");
            }
            count++;
        }

        System.out.println("Du hast " + pickupCount + " Pilze gefunden.");

        printBoard();
    }

    private static void resetMushrooms() {
        board = new int[ROWS][COLS]; // Neues leeres Spielfeld
        for (int i = 0; i < MUSHROOMS; i++) { // Alle Pilze setzen
            setMushroom();
        }
    }

    private static void setMushroom() {
        int randRow = RAND.nextInt(ROWS);
        int randCol = RAND.nextInt(COLS);
        if(board[randRow][randCol] == 0) {
            board[randRow][randCol] = 1;
        }
        else {
            setMushroom();
        }
    }

    private static void printBoard() {
        for(int[] row : board) {
            System.out.print("| ");
            for(int col : row) {
                if(col == 1) {
                    System.out.print("\uD83C\uDF44 ");
                }
                if(col == 2) {
                    System.out.print("\uD83C\uDF44\u200D\uD83D\uDFEB ");
                }
                else {
                    System.out.print(" " + col + " ");
                }
            }
            System.out.print(" |");
            System.out.println();
        }
    }
}
