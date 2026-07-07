package de.lubowiecki.lambda;

public class LambdaTest2 {

    public static void main(String[] args) {

        // Lambdas sind Objekte, die einer Referenz zugewiesen werden können
        // void jump();
        // Parameter-Liste und Rückgabetyp der abstrakten Methode muss beachtet werden
        Jumpable j1 = () -> System.out.println(123);

        Jumpable j2 = () -> {
            System.out.println(1);
            System.out.println(2);
            System.out.println(3);
        };

        Jumpable j3 = () -> {
            int j = 100;
            j++;
            if(j == 101) {
                System.out.println("Vorzeitiges Ende " + j);
                return;
            }
            j++;
            System.out.println("Normales Ende " + j);
        };

        j1.jump();
        j2.jump();
        j3.jump();

    }
}

// Basis für ein Lambda ist IMMER ein FunctionalInterface
// FunctionalInterface hat nur eine Abstrakte-Methode (SAM = Single Abstract Method)
// Kann statische und default Methoden enthalten
// Kann zusätzlich Methoden von Object als abstrakte Methoden enthalten
// Kann Konstanten enthalten

// Lambdas sind dynamische Implementierungen der abstrakten Methode eine FunctionalInterface!

@FunctionalInterface // Prüft die Anforderungen
interface Jumpable {

    // Im Interface sind alle Methoden und Attribute public
    void jump();

    // void jump(int i); // Weitere abstrakte Methoden sind im FunctionalInterface NICHT erlaubt

    static void doSomething() {
        System.out.println("Do Something!");
    }

    // default Methoden sind IMMER Instanzmethoden
    default void doSomethingElse() {
        System.out.println("Do Something Else!");
    }

    // Wird für das Lambda ignoriert, da die Methode bereits in Object implementiert ist
    boolean equals(Object o); // gleiches gilt für hashCode und toString
}