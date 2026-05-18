package de.lubowiecki;

public class PrimitiveDatentypen {

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //         char <

        // 123 Literal: Wert vor einer Zuweisung auf eine Variable
        System.out.println(123); // Literal wird ausgegeben
        System.out.println(123 + -25);

        byte zahl1 = 123;
        byte zahl2 = -25;
        System.out.println(zahl1); // Variable wird ausgegeben
        System.out.println(zahl1 + zahl2); // Rechnen mit Variablen


        // wird in Kontrollstrukturen für Bedingungen verwendet
        boolean ok = true;
        ok = false;

        // Bedingung MUSS boolean als Ergebnis haben
        if(ok) {
            // wird nur ausgeführt, wenn ok true ist
            System.out.println("Das ist ja super!");
        }

        int i = 0;
        while (true) { // endlos-Schleife // i < 100 auch ok
            //...
            System.out.println(i++);
        }

        // Dieser Bereich wird NIE erreicht
        //System.out.println("Ende"); // Compiler-Error
    }
}
