package de.lubowiecki.aufgaben;

public class Aufgabe1 {

    /*
        Schaue dir die primitiven Datentypen in den KeyNotes an
        und schreibe für jeden Datentyp 2 Variablendeklarationen.
    */

    public static void main(String[] args) {

        // byte < short < int < long < float < double
        //         char <

        // Lokale Variablen: Werden direkt in der Methode deklariert
        boolean b1; // Deklaration: Name wird reserviert
        b1 = true; // Initialisierung: Erste Wertzuweisung
        boolean b2 = false; // Beides in einem

        byte bt1;
        bt1 = 100;
        System.out.println(bt1); // Lokale Varieblen MÜSSEN vor der Verwendung initialisiert werden

        byte bt2 = -120;

        short s1 = 200;
        short s2 = 32_000;
        System.out.println(s1 + s2);
        System.out.println(s1);

        int i = 10_235;
        int j = -10_500_000;
        var k1 = -10_500_000; // Kompiler ermittelt den Datentyp automatisch
        var k2 = 10; // automatisch int
        var k3 = (byte)10; // byte

        long l1 = 10_000_000; // ohne L ist es ein int, der zu long angehoben (primitive widening) wird
        long l2 = 10_000_000_000_000L; // long
        byte bt3 = (byte)l1; // primitive narrowing - passiert NICHT automatisch

        //float f1 = 10.0; // Fließkommazahlen sind automatisch doubles
        float f1 = 10.0F; // F produziert einen float

        f1 = l1;

        double d1 = 10.0;

        // i = d1; // Ohne Cast nicht möglich. double ist größer als int

        char c1 = 'A';
        char c2 = '&';
        char c3 = '\u3188';
        i = c1;
        System.out.println(i);
        System.out.println((char)i);
        System.out.println(c3);

        System.out.println();

        bt1 = 020; // Octal: beginnt mit 0
        System.out.println(bt1);
        bt1 = 0b10100; // Binär
        System.out.println(bt1);
        bt1 = 0x12;
        System.out.println(bt1);
    }
}
