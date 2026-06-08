package de.lubowiecki.oop;

public class SuperTest {

    public static void main(String[] args) {

//        A a = new A();
//        B b = new B();
//        A a = b; // B IS-A A
//        Object o = b; // B IS-A Object

        System.out.println("------------");

        C c = new C();

        c.machWas(); // Methode wurde von A an B und von B an C vererbt
        c.machWasAnderes(); // Methode wurde von B an C vererbt
        c.machWasGanzAnderes(); // Methode von C
        System.out.println(c.text1);
        System.out.println(c.text2);
        System.out.println(c.text3);

        B b = c;
        b.machWas();
        b.machWasAnderes();
        //b.machWasGanzAnderes(); // Error: ist nur in C verfügbar
        System.out.println(b.text1);
        System.out.println(b.text2);
        //System.out.println(b.text3); // Error: Nur in C sichtbar

        A a = c;
        a.machWas();
        //a.machWasAnderes(); // Error: ist nur in B verfügbar
        //a.machWasGanzAnderes(); // Error: ist nur in C verfügbar
        System.out.println(a.text1);
        //System.out.println(a.text2); // Error: Nur in B sichtbar
        //System.out.println(a.text3); // Error: Nur in C sichtbar

        // Überschreiben = In einer Kindklasse eine geerbte Methode ersetzen

    }
}

class A {

    String text1 = "Attribut: A";

    public A() {
        // super(); automatischer Aufruf des Konstruktors der Elternklasse (Object)
        System.out.println("Konstruktor: A");
    }

    void machWas() {
        System.out.println("Methode1: A");
    }
}

class B extends A {

    String text2 = "Attribut: B";

    public B() {
        // super(); automatischer Aufruf des Konstruktors der Elternklasse (A)
        System.out.println("Konstruktor: B");
    }

    void machWasAnderes() {
        System.out.println("Methode2: B");
    }
}

class C extends B {

    String text3 = "Attribut: C";

    public C() {
        // super(); automatischer Aufruf des Konstruktors der Elternklasse (B)
        System.out.println("Konstruktor: C");
    }

    void machWasGanzAnderes() {
        System.out.println("Methode3: C");
    }
}
