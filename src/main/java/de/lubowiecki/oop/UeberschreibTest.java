package de.lubowiecki.oop;

public class UeberschreibTest {

    public static void main(String[] args) {

        AB ab = new AB();
        ab.machWas();
        System.out.println(ab.zahl);

        System.out.println();

        // Referenztyp: AA
        // Obejkttyp: AB
        AA aa = new AB(); // AB IS-A AA
        aa.machWas(); // Wird auf dem Objekttyp ausgeführt
        System.out.println(aa.zahl); // Wird auf dem Referenztyp ausgeführt

        // Istanzmethoden werden IMMER auf dem Objekttyp ausgeführt
        // Instanzvariablen und statische Methoden werden auf dem Referenztyp ausgeführt


        System.out.println("--------");
        AA a2 = new AA();
        a2.machWas();
        AA a3 = new AB();
        a3.machWas();

    }
}

class AA {

    int zahl = 100;

    void machWas() {
        System.out.println("Method A - " + zahl);
    }
}

class AB extends AA {

    // Überlagert das Original aus AA
    int zahl = 200; // Hiding

    @Override // Methode aus der Elternklasse wird ersetzt - Optional / Marker
    void machWas() {
        //super.machWas(); // Zugriff auf die Methode der Elternklasse
        System.out.println("Method B - " + zahl);
    }
}
