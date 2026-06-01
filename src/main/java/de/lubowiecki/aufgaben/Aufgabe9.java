package de.lubowiecki.aufgaben;

public class Aufgabe9 {


    /*
    Übung
    Schreibe ein Programm, dass das Spiel Pilzsuche realisiert.

    Beim Starten des Programms wird ein 10 Zeilen und 10 Spalten großes Spielfeld erzeugt.
    Danach werden automatisch 10 „Pilze“ positioniert. Jeder Pilz wird auf einer x/y-Koordinate platziert.
    Danach hat der Spieler 10 Versuche Zeit so viele Pilze wie möglich durch Eingabe der Koordinaten zu finden.

    Nach 10 Versuchen endet das Spiel und es wird die Anzahl der gefundenen Pilze angezeigt.

    Erweiterung
    Der Spieler wird gefragt, ob er noch ein weiteres Mal spielen möchte.
     */

    public static void main(String[] args) {


        int[][] spielfeld = new int[10][10];
        spielfeld[1][2] = 1;
        spielfeld[3][7] = 1;
        spielfeld[2][5] = 2;
        spielfeld[0][8] = 1;

        for(int[] reihe : spielfeld){
            System.out.print("|");
            for(int zelle : reihe){
                String output = switch(zelle) {
                    case 1 -> "\uD83C\uDF44";
                    case 2 -> "\uD83C\uDF44\u200D\uD83D\uDFEB";
                    default -> "  ";
                };
                System.out.print(output);
            }
            System.out.print("| \n");
        }
    }
}
