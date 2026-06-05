package de.lubowiecki.generics;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class GenericTest {

    public static void main(String[] args) {

        List<String> namen;
        List<Integer> zahlen;

        IntegerBox b1 = new IntegerBox(100);
        System.out.println(b1);
        b1.setZahl(200);

        var i = 10;

        Box b = new Box(100); // Autoboxing von int auf Integer und komplex widening von Integer auf Object
        b.setZahl("Moin");
        b.setZahl(10.15); // Autoboxing von double auf Double und komplex widening von Double auf Object
        System.out.println(b.getZahl());

        GenericBox<Double> dBox = new GenericBox<>(10.5);
        dBox.setZahl(20.2);
        System.out.println(dBox.getZahl());

        GenericBox<Integer> iBox = new GenericBox<>(100);
        GenericBox<String> sBox = new GenericBox<>("Moin");

        // Beispiel
        Map<String, Integer> einwohner = new HashMap<>();
        einwohner.put("Kiel", 320_000);
        einwohner.put("Hamburg", 1_900_000);


    }
}

class IntegerBox {

    private int zahl;

    public IntegerBox(int zahl) {
        this.zahl = zahl;
    }

    public int getZahl() {
        return zahl;
    }

    public void setZahl(int zahl) {
        this.zahl = zahl;
    }
}

class DoubleBox {

    private double zahl;

    public DoubleBox(double zahl) {
        this.zahl = zahl;
    }

    public double getZahl() {
        return zahl;
    }

    public void setZahl(double zahl) {
        this.zahl = zahl;
    }
}

// Typ Object ist zu allgemein
class Box {

    private Object zahl;

    public Box(Object zahl) {
        this.zahl = zahl;
    }

    public Object getZahl() {
        return zahl;
    }

    public void setZahl(Object zahl) {
        this.zahl = zahl;
    }
}

// Der generische Typ (T) muss bei der Verwendung ein komplexer Typ sein
class GenericBox<T> {

    private T zahl;

    public GenericBox(T zahl) {
        this.zahl = zahl;
    }

    public T getZahl() {
        return zahl;
    }

    public void setZahl(T zahl) {
        this.zahl = zahl;
    }
}