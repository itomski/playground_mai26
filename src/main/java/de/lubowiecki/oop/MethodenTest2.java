package de.lubowiecki.oop;

public class MethodenTest2 {

    public static void main(String[] args) {

        // Statische Methoden dürfen nur statische Methoden direkt aufrufen
        // machWas(); // Error
        machWasAnderes(); // Ok

        // MethodenTest2.machWas(); // AUfruf direkt über die Klasse: Error

        MethodenTest2 mt2 = new MethodenTest2(); // Instanzierung
        mt2.machWas(); // Aufruf über die Instanz

    }

    private void machWas() {
        System.out.println("Hallo1");
        machWasGanzAnderes(); // Instanzmethoden rufen andere Instanzmethoden über das this auf
        // this ist eine Referenz auf das aktuelle Objekt, auf dem die machWas-Methode aufgerufen wurde
        // this steht in statischen Methoden NICHT zur Verfügung
    }

    private void machWasGanzAnderes() {
        System.out.println("Hallo3");
    }

    private int machWasGanzAnderes2() {
        System.out.println("Hallo4");
        return 10; // Methoden mit Rückgabetyp MÜSSEN return mit einem Wert enthalten
        // System.out.println("Moin"); // Anweisung ist NICHT erreichbar: Error
    }

    private int machWasGanzAnderes3(int wert) {
        if(wert < 10) {
            return 10;
        }
        System.out.println("Moin");
        return 0;
    }

    private static void machWasAnderes() {
        System.out.println("Hallo2");
        return; // void Methoden können ein return ohne Wert enthalten
    }

}
