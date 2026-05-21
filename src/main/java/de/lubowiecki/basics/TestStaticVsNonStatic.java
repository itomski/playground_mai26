package de.lubowiecki.basics;

import java.time.LocalDate;

public class TestStaticVsNonStatic {

    public static void main(String[] args) {

        Pkw p1 = new Pkw();
        Pkw p2 = new Pkw();
        Pkw p3 = new Pkw();
        p1.gibGas(100);
        p1.gibGas(10);
        System.out.println(p1.geschwindigkeit);
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p2.hashCode());

        // Pkw ist kein String d.h. Vor der Ausgabe muss Pkw in String konvertiert werden
        // Konvertierung erfolgt mit der Methode toString()
        // Wird ein Objekt ausgegeben ruft er automatisch die toString-Methode auf
        System.out.println(p3.toString());


//        Pkw.gibGas(20);
//        Pkw.gibGas(35);
//        System.out.println(Pkw.geschwindigkeit);

//        Rechner r = new Rechner();
//        System.out.println(r.add(15.0, 25.7));
        System.out.println(Rechner.add(15.0, 25.7));

//Math m = new Math(); // Konstruktor ist privat
        System.out.println(Math.pow(10, 2));

//LocalDate ld = new LocalDate(); // Nicht möglich


    }
}
