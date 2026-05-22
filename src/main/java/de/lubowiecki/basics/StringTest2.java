package de.lubowiecki.basics;

public class StringTest2 {

    public static void main(String[] args) {

        // String hat statische Methoden, die Parameter verarbeiten...
        // und Instanzmethoden, die den Inhalt verarbeiten

        String str1 = "Das ist das Haus von Nikigraus";
        System.out.println(str1.length()); // Anzahl der Zeichen

        // Änderungen produzieren IMMER einen neuen String, da String Immutable ist
        System.out.println(str1.toUpperCase());
        System.out.println(str1.toLowerCase());

        System.out.println(str1.startsWith("Das"));
        System.out.println(str1.endsWith("laus"));
        System.out.println(str1.indexOf("Niki"));
        System.out.println(str1.indexOf("Nox")); // Wenn nicht vorhanden, dann -1

        //System.out.println(str1.indexOf("Niki") > -1 || str1.indexOf("Nox") > -1);
        System.out.println(str1.indexOf("i", 5)); // Starte Suche ab Position 5
        System.out.println(str1.lastIndexOf("i")); // Beginnt mit der Suche am Ende der Zeichenkette

        System.out.println(str1.substring(10)); // Teilstring ab Pos 10

        // Startpos inkl, Endpos excl
        System.out.println(str1.substring(10, 20)); // Teilstring ab Pos 10 bis 20 (exclusive)

        System.out.println(str1.charAt(10));

        String namenListe = String.join(", ", "Peter", "Bruce", "Carol");
        System.out.println(namenListe);

        String[] namen = {"Peter", "Bruce", "Carol"};
        namenVerkettung("#", namen);
    }

    static void namenVerkettung(String kleber, String[] namen) {
        String namenListe = String.join(kleber, namen);
        System.out.println(namenListe);
    }

}
