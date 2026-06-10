package de.lubowiecki.aufgaben.loesungen.robots;

import java.util.Scanner;

public class App {

    /*
    Schreibe ein Konsolen-Programm zur Simulation eines Roboters. Der Roboter soll auf einem
    Spielfeld von 20 x 20 Feldern frei bewegt werden können.
    Das Spielfeld inkl. Der aktuellen Position des Roboters soll nach jeder Bewegung angezeigt werden.

    Die Bewegung soll durch eine Zeichenkette von Richtungen vorgegeben werden können.
    Beispiele:
    >>>r>>> könnte heißen 3 Felder vorwärts, Drehung nach Rechts und wieder 3 Felder vorwärts.

    >>L>>L<< könnte heißen 2 Felder vorwärts, Drehung nach Links, 2 Felder vorwärts, Drehung
    nach Links, 2 Felder rückwärts

    Freie Felder können z.B. durch X angezeigt werden und die Position des Roboters durch ein @.
    Nach jeder Eingabe wird der Roboter bewegt und das Spielfeld angezeigt.

    Sollte die Bewegung in eine Richtung nicht möglich sein und ein Exception geworfen werden, dann
    fange die Exception ab und reagiere entsprechend.
    (Entweder den Rest der Bewegung ignorieren oder nur unerlaubte Schritte ignorieren)
    */

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        Board board = new Board(10);
        Bot bot = new Bot();

        board.set(bot);
        board.print();

        while(true) {
            System.out.print("Eingabe: ");

            String input = scanner.next().trim().toUpperCase();

            if(input.equals("EXIT")) break; // Programm verlassen

            String[] steps = input.split("");

            for (String step : steps) {
                bot.move(step); // Roboter steuern
                // TODO: Alte Position leeren
                if (!board.set(bot)) break; // Auf dem Board positionieren
            }
            board.print();
        }
    }
}
