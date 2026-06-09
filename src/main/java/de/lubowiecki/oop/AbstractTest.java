package de.lubowiecki.oop;

public class AbstractTest {

    public static void main(String[] args) {

        //AClass ac = new AClass(); // Error: AClass ist abstrakt

        // Abstrakte Klasse kann als Referenztyp verwendet werden
        AClass ac = new BClass();
    }
}

abstract class AClass {

    public AClass() {
        //super();
        System.out.println("Konstruktor AClass");
    }

    // Verpflichtet die Kindklasse zum Einbau
    abstract void getInfo();
}

class BClass extends AClass {

    public BClass() {
        //super();
        System.out.println("Konstruktor BClass");
    }

    @Override
    void getInfo() {
        //...
    }
}
