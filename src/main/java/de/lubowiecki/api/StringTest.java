package de.lubowiecki.api;

public class StringTest {

    public static void main(String[] args) {

        String s = "Das ist das Haus ";
        s += "von Nikigraus";
        s = s.toLowerCase();

        System.out.println(s);

//        String ausgabe = "";
//        for (int i = 0; i < 100; i++) {
//            ausgabe += i;
//        }

        StringBuilder ausgabe = new StringBuilder();
        for (int i = 0; i < 100; i++) {
            ausgabe.append(i);
        }

        System.out.println(ausgabe);

        String s2 = "Peter " + "Parker";
        System.out.println(s2);

        final String s3 = "Banner"; // Compiletime-Konstante
        System.out.println("Bruce " + s3);

        String s4 = "Stark";
        System.out.println("Tony " + s4);

        final String s5; // Runtime-Kosntante
        s5 = "Denvers";
        System.out.println("Carol " + s5);

        String s6 = "Peter"; // Landet im Pool
        String s7 = "Peter"; // Verwendet den Wert aus dem Pool
        String s8 = new String("Peter"); // Erzeugt IMMER einen neuen String / Pool wird nicht verwendet
        s8 = s8.intern(); // Referenz wird auf den Wert im Pool umgeleitet


        // mutable String
        StringBuilder sb = new StringBuilder(); // default capacity = 16
        sb.append("Peter");
        sb.append(" ");
        sb.append("Parker");
        sb.insert(0, "#####");

        // Vergrößerung der capacity = alte Größe * 2 + 2

        System.out.println(sb.length()); // Anzahl der Zeichen
        System.out.println(sb.capacity()); // Größe des internen Arrays

        System.out.println(sb); // Erst hier wird der String erzeugt
        String erg = sb.toString();

        sb = new StringBuilder(); // default capacity = 16
        sb = new StringBuilder("Text"); // capacity = Anzahl der Zeichen + 16
        sb = new StringBuilder(100); // capacity = 100

        // Die Methoden manipulieren direkt das StringBuilder-Objekt
        sb.append(123).append(" ").append(10.2);

    }
}
