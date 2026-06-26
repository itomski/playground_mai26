package de.lubowiecki.oop;

import java.io.IOException;
import java.util.Random;

public class ZugriffTest {

    public static void main(String[] args) {

        Super s = new Super();
        System.out.println(s.wert);
        s.getWert();
        System.out.println(s.nextWert);
        s.getNextWert();

        System.out.println();

        Sub s2 = new Sub();
        System.out.println(s2.wert);
        s2.getWert();
        System.out.println(s2.nextWert);
        s2.getNextWert();

        System.out.println();

        Super s3 = new Sub();
        System.out.println(s3.wert); // Attribute werden auf dem Referenztyp ausgeführt
        s3.getWert(); // Instanzmethoden werden auf dem Objekttyp ausgeführt
        System.out.println(s3.nextWert); // statische Attribute werden auf dem Referenztyp ausgeführt
        s3.getNextWert(); // statische Methoden werden auf dem Referenztyp ausgeführt

        // Upcasting - limitiert die nutzbaren Möglichkeiten des Objekts
        Object o = "Moin"; // String IS-A Object
        o = 123; // Autoboxing von int Integer, Integer IS-A Object
        o = new Random(); // Random IS-A Object

        // Über die Referenz o sind die speziellen Methoden der Objekte nicht erreichbar

        System.out.println();

        System.out.println(Long.remainderUnsigned(10, 9));
        System.out.println(Long.divideUnsigned(10, 9));

        System.out.println();

        System.out.println(Long.remainderUnsigned(10, -9));
        System.out.println(Long.divideUnsigned(10, -9));

        System.out.println();

        System.out.println(Long.remainderUnsigned(-10, 9));
        System.out.println(Long.divideUnsigned(-10, 9));

        System.out.println();

        System.out.println(Long.remainderUnsigned(-10, -9));
        System.out.println(Long.divideUnsigned(-10, -9));


        //int i = 1, j = 2;
        //int i[] = 1, j = 2;

    }
}

class Super {

    public int wert = 100;
    public static int nextWert = 150;

    public void getWert() {
        System.out.println(wert);
    }

    public static void getNextWert() {
        System.out.println(nextWert);
    }
}

class Sub extends Super {

    public int wert = 200;
    public static int nextWert = 250;

//    public void getWert() {
//        System.out.println(wert);
//    }

    public static void getNextWert() {
        System.out.println(nextWert);
    }
}

interface TestInterface {

    void machWas() throws IOException;

}

class TestClass implements TestInterface {

    @Override
    public void machWas() throws IOException {

    }
}
