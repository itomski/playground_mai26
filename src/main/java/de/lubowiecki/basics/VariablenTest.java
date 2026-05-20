package de.lubowiecki.basics;

public class VariablenTest {

    public static void main(String[] args) {

        // Klassenvariable
        System.out.println(Variablen.text); // Lesen
        Variablen.text = "Moin"; // Schreiben
        System.out.println(Variablen.text); // Lesen

        // Klassenmethode
        Variablen.machWas();

        // Kein Klasseninventar!
//        Variablen.machWasAnderes();
//        System.out.println(Variablen.andererText);

        // Instanzmethoden und Instanzvariablen werden IMMER auf einer Instanz ausgeführt
        Variablen v = new Variablen();
        v.machWasAnderes();
        System.out.println(v.andererText);

    }
}
