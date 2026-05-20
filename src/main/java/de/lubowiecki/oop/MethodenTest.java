package de.lubowiecki.oop;

public class MethodenTest {

    // Klassenvariable (static)
    static int zahl = 100;

    // Instanzvariable
    int andereZahl = 200;

    public static void main(String[] args) {

        System.out.println(getRandom()); // Methode wird aus dieser Klasse ausgeführt
        System.out.println(AndereKlasse.getRandom());

        // Instanz = Objeckt gebaut aus einer Klasse
        var obj = new MethodenTest();
        System.out.println(obj.getNextRandom()); // Instanzmethoden werden auf einem Objekt ausgeführt
        obj.andereZahl = 50;

        var obj2 = new MethodenTest();
        obj2.andereZahl = 237;

        System.out.println();

        obj.zahl = 520;
        System.out.println(obj2.zahl); // Aufruf über das Objekt
        System.out.println(obj.zahl); // Aufruf über das Objekt
        System.out.println(zahl); // Aufruf über die Klasse
        System.out.println(MethodenTest.zahl); // Aufruf über die Klasse
    }

    // Klassenmethode (static)
    // static = Methode kann direkt auf der Klasse(Bauplan) ausgeführt werden
    // int = Rückgabe-Typ der Methode
    // getRandom = Name der Methode
    // () = Parameterliste
    // return = Rückgabe eines Wertes an den Aufrufer der Methode
    static int getRandom() {
        return 0;
    }

    // Instanzmethode (nicht static)
    int getNextRandom() {
        return 2;
    }
}
