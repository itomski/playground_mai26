package de.lubowiecki.basics;

public class OperatorenTest1 {

    public static void main(String[] args) {

        int i = 100;
        i += 100; // i = (int)(i + 100);
        i *= 100; // i = (int)(i * 100);

        i = 10;
        i %= 2; // i = (int)(i % 2); // Ganzzahlige-Division mit Rest

        i = 10;
        i &= 2; // AND
        // 00001010
        // 00000010
        // 00000010 -> 2

        i = 10;
        i |= 2; // OR
        // 00001010
        // 00000010
        // 00001010 -> 10

        i = 10;
        i ^= 2; // XOR
        // 00001010
        // 00000010
        // 00001000 -> 8

        // Zum Rechnen werden alle Typen kleiner als int auf int angehoben
        byte b1 = 100;
        byte b2 = 50;
        b1 += b2; // b1 = (byte)(b1 + b2);
        System.out.println(b1);
    }
}
