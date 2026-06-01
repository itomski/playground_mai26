package de.lubowiecki.basics;

public class Promotion {

    public static void main(String[] args) {

        int i = 10;
        double d = 12.2;
        short s = 7_000; // muss im wertebereich von short liegen
        float f = 10.2f;
        long l = 100; // primitive Widening von int auf long
        long l2 = 100l; // kein primitive Widening

        // Der Datentyp der Operanden muss zum Rechnen für beide Operanden angegliechen werden

        double erg1 = i + d; // primitive Windening zum größeren Typ und dann Operation
        int erg2 = i / 7; // Da beide Operanden int sind ist das Erg auch int. Nachkommastelle geht verloren
        long erg3 = i + l;
        // short erg4 = s + s; // Error: mind. int
        int erg4 = s + s;
        // byte, short und char werden zum Rechenen mind. auf int angehoben

        // Narrowing (Einschränken) kann NUR mit einem Cast erfolgen
        //byte b = 100l; // Error
        byte b = (byte)100l; // OK
        b = (byte)d; // OK - führt ggfl. zur Wertverlusst

        i = 128;
        b = (byte)i; // Bei einem Cast kann es zu einem Über- oder einem Unterlauf kommen
        System.out.println(b);

        b += s; // b = (byte)(b + s);
        b++; // b = (byte)(b + 1);

        b = 100;
        b += 30;
        System.out.println(b);

        b = 126;
        b++;
        b++;
        System.out.println(b);

        // Zusammengesetzte Operatoren (+=,-= etc.) und Increment/Decrement kann NUR auf Variablen verwendet werden
        // b = 1++; // Error

        int j;
        //System.out.println(j); // Error: Lokale Variablen müssen vor der Verwendung initialisiert werden!
        // Instanz- und Klassenvariablen bekommen Standardwerte, wenn sie nicht initialisiert werden
        // Lokale Variable: Werden innerhalb der Methode dekalariert
        // Methodenparameter sind ebenfalls lokale Variablen
    }
}
