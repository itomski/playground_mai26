package de.lubowiecki.basics;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hallo String"; // Literal
        String s2 = new String("Hallo String"); // Konstruktor
        String s3 = "Hallo ".concat("String");
        System.out.println(s1);
        // Bei String basiert der HashCode auf dem Inhalt
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s3);
        System.out.println(s3.hashCode());

        System.out.println(s1 == s2); // Referenzgleichheit
        System.out.println(s2 == s3); // Referenzgleichheit
        System.out.println(s1 == s3); // Referenzgleichheit

        System.out.println();

        // Strings sind in Java Objekte
        String s = "ABCDE";
        s = "ÄÖÜß€";
        s += "ABC";
        //s.toLowerCase(); // Erzeugt ein neues Objekt - Refernz wird nicht geändert
        s = s.toLowerCase(); // Erzeugt ein neues Objekt - Refernz WIRD geändert
        System.out.println(s);

        // Strings sind in Java Immutable (Unveränderbar)

        // String Lieteral Pool
        String s4 = "Moin"; // Landet im Pool
        String s5 = "Moin";
        String s6 = new String("Moin"); // Landet NICHT im Pool
        //s6 = s6.intern(); // Leitet die Referenz auf den Pool um
        System.out.println(s4 == s5); // Referenzvergleich: Zeigen beide Rferenzen auf das gleiche Objekt auf dem Heap?
        System.out.println(s4 == s6);
        System.out.println(s4.equals(s6)); // Inhaltsvergleich: Sind beide Zeichenketten gleich?

        System.out.println();

        Pkw p = new Pkw();
        // Jedes Objekt erbt diese Methoden von der Klasse-Object
        System.out.println(p.getClass()); // Liefert den Namen der Klasse
        System.out.println(p.hashCode()); // Liefert den HashCode der Klasse
        System.out.println(p.equals(null)); // Vergleicht Objekte
        System.out.println(p.toString()); // Konvertiert ein Objekt in String
        System.out.println(p); // Konvertiert ein Objekt automatisch in String mit toString


    }
}
