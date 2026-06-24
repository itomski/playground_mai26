package de.lubowiecki.oop;

import java.time.LocalTime;
import java.lang.Math.*; // Alle inneren Klassen werden importiert
import static java.lang.Math.*; // Das komplette statische Inventar wird importiert

public class InterfaceTest {
}

interface ITest {

    int i = 20; // public static final

    // static Initializer im Interface nicht erlaubt
//    static {
//        i = 20;
//    }

    default void change() {
        // i = 20; // ist final
    }
}

class IClass {

    final int i;
    //static final int j = (LocalTime.now().isBefore(LocalTime.NOON)) ? 100 : 200;
    static final int j;

    static {
        // Klassenkonstanten MÜSSEN spätestens im static Initializer belegt werden
        if(LocalTime.now().isBefore(LocalTime.NOON)) {
            j = 200;
        }
        else {
            j = 100;
        }
    }

    static {
    }

    static {
    }

    {
        //...
    }
    {
        //...
    }
    {
        //...
    }

    public IClass() {
        //super();
        // <--- Instanzinitializer
        this.i = 100; // Instanzkonstanten MÜSSEN spätestens im Konstruktor belegt werden
    }
}
