package de.lubowiecki.basics;

public class ScopeTest {

    public static void main(String[] args) {

        int i = 10; // Lokale Variable: Ab Deklaration bis zum Ende der Methode verfügbar

        {
            int j = 100; // Nur bis zum Ende dieses Blocks sichtbar
        }
        int j = 200; // Redeklaration möglich, da j aus dem Block bereits Out-Of-Scope ist

        // int i = 20; // Redeklaration: Error. Variable i ist bereits deklariert

        for (int k = 0; k < 10; k++) {

        } // Das k ist Out-Of-Scope

        for (int k = 0; k < 100; k++) {

        }

        int k2 = 0; // Bis zum Ende der Methode sichtbar
        for (; k2 < 10; k2++) {

        } // Das k ist Out-Of-Scope

//        for (int k2 = 0; k2 < 100; k2++) { // Error: Redeklaration
//            //...
//        }

        for (k2 = 0; k2 < 100; k2++) { // Ok: Neuzuweisung
            //...
        }

//        if(i < 5) {
//            String output = "Kleiner";
//        }
//        else {
//            String output = "Größer";
//        }
//
//        System.out.println(output); // Error: output ist Out-Of-Scope


        String output;
        if(i < 5) {
            output = "Kleiner";
        }
        else {
            output = "Größer";
        }
        System.out.println(output); // Ok


//        i = 4;
//        String output2;
//        if(i < 5) { // Kompiler kennt nur den Datentyp von i
//            output2 = "Kleiner";
//        }
//        System.out.println(output2); //Error: Es ist nicht sicher, dass output2 initialisiert ist


        String output2 = "...";
        if(i < 5) {
            output2 = "Kleiner";
        }
        System.out.println(output2); // Ok
    }

}
