package de.lubowiecki.basics;

import java.io.IOException;

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

        double arr[] = new double[4];
        arr[0] = 10; // primitive Widening von int auf double

        Double arr2[] = new Double[4];
        //arr2[0] = 10; // Error
        arr2[0] = Double.valueOf(10); // OK: primitive Widening + Boxing
        double d = arr2[0].doubleValue(); // OK: Unboxing

        try {

        }
        catch (RuntimeException e) {
            e = new RuntimeException("...");
            throw e;
        }

        try {

        }
        catch (NullPointerException | ArrayIndexOutOfBoundsException e) {
            //e = new RuntimeException("..."); // im Multi-Catch ist e final
            //throw e;
        }

//        try {
//            //...
//        }
//        catch(IOException x) { // Error: Diese Checked-Exception kann im try nicht entstehen
//
//        }

        try {
            //...
        }
        catch(RuntimeException x) { // Ok

        }

        try {
            //...
        }
        catch(Exception x) { // Ok

        }
    }
}
