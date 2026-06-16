package de.lubowiecki.lambda;

public class AnonymeKlassen {

    public static void main(String[] args) {

        //Machbar m1 = new Machbar(); // Error: Interfaces sind nicht instanzierbar

        // Anonyme Klasse
        // Die Klasse implementiert das Interface Machbar und wird gleich instanziert
        // Danach kann diese Klasse nicht noch mal instanziert werden
        Machbar m1 = new Machbar() {
            @Override
            public boolean doTheJob1() {
                return false;
            }
        };

        // Das Lambda ist die Implementierung einer Methode eines Interface
        // boolean doTheJob1();
        Machbar m = () -> 10 > 20;

        System.out.println(m.doTheJob1());

        System.out.println();

        Vergleich v1 = (a, b) -> a > b;
        Vergleich v2 = (a, b) -> a <= b;

        System.out.println(v1.ausfuehren(10, 15));
        System.out.println(v2.ausfuehren(10, 15));

    }
}

// Basis für ein LambdaAusdruck ist ein FunctionalInterface
// FunctionalInterface hat nur eine einzige abstrakte Methode
// SAM = Single Abstract Method

@FunctionalInterface
interface Machbar {

    boolean doTheJob1();

    //int doTheJob2();
}

@FunctionalInterface
interface Vergleich {

    boolean ausfuehren(int a, int b);
}