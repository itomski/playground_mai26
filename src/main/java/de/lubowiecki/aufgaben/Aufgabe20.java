package de.lubowiecki.aufgaben;

import java.util.Scanner;

public class Aufgabe20 {

    /*

    Schreibe ein Programm für eine Kaﬀeemaschine.

    Über die Konsole kann ein Produkt ausgewählt werden.
    Das Programm reduziert den Wert für Wasser, Kaffee und Milch entsprechend des Kaffeprodukts.

    Wenn einer der Werte 0 erreicht, soll eine passende Exception geworfen werden.
    Passen = Hinweis, weleches Material nachgefüllt werden muss.

    */

    private static final String KEYS = """
            ********************************************
            |   1: Espresso
            |   2: Cappuccino
            |   3: Americano
            |   4: Latte Macciato
            |   5: ...
            |   6: ...
            |   7: ...
            |   8: Exit
            ********************************************
            """;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Kaﬀeemaschine automat = new Kaﬀeemaschine();


        app: while(true) {
            System.out.println(KEYS);
            System.out.print("Deine Wahl: ");
            int auswahl = scanner.nextInt();

            switch (auswahl) {
                case 1 -> automat.zubereiten(Kaffeespezialitaet.ESPRESSO);
                case 2 -> automat.zubereiten(Kaffeespezialitaet.CAPPUCCINO);
                case 3 -> automat.zubereiten(Kaffeespezialitaet.AMERICANO);
                case 4 -> automat.zubereiten(Kaffeespezialitaet.LATTE_MACCHIATO);
                case 5 -> automat.nachfuellenKaffee();
                case 6 -> automat.nachfuellenWasser();
                case 7 -> automat.nachfuellenMilch();
                case 8 -> {
                    break app;
                }
            }
        }
    }
}

class Kaﬀeemaschine {

    private int kaffee;
    private int milch;
    private int wasser;

    public Kaﬀeemaschine() {
        this.kaffee = 200;
        this.milch = 500;
        this.wasser = 1000;
    }

    public boolean zubereiten(Kaffeespezialitaet spezialitaet) {
        return switch (spezialitaet) {
            case ESPRESSO -> zubereiten(10, 30, 0);
            case CAPPUCCINO -> zubereiten(18, 60, 60);
            case AMERICANO -> zubereiten(10, 120, 0);
            case LATTE_MACCHIATO -> zubereiten(18, 40, 80);
        };
    }

    private boolean zubereiten(int kaffee, int wasser, int milch) {
        if(this.kaffee - kaffee <= 0) throw new ZuWenigKaffeeException();
        if(this.wasser - wasser <= 0) throw new ZuWenigWasserException();
        if(this.milch - milch <= 0) throw new ZuWenigMilchException();
        this.kaffee -= kaffee;
        this.wasser -= wasser;
        this.milch -= milch;
        return true;
    }

    public void nachfuellenKaffee() {
        this.kaffee = 200;
    }

    public void nachfuellenMilch() {
        this.milch = 500;
    }

    public void nachfuellenWasser() {
        this.wasser = 1000;
    }
}

enum Kaffeespezialitaet {
    ESPRESSO, CAPPUCCINO, AMERICANO, LATTE_MACCHIATO
}

class ZuWenigKaffeeException extends RuntimeException {
}
class ZuWenigMilchException extends RuntimeException {
}
class ZuWenigWasserException extends RuntimeException {
}

