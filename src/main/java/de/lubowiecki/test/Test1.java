package de.lubowiecki.test;

import java.util.Arrays;

import static java.lang.Math.*; // Importiert alle statischen Methoden und Attribute der Klasse

public class Test1 {

    {} // Instanzinitializer: Wird bei der Instanzierung ausgeführt

    static {
        String str = null;
        //System.out.println(str.toUpperCase()); // ExceptionInInitializerError
    } // Static Initializer: wird beim Laden der Klasse ausgeführt

    public static void main(String[] args) {

        System.out.println("Moin");
        Object o = new String("...");


        try {
            // Hier taucht keine Exception auf
        }
        catch (RuntimeException e) { // RuntimeException kann IMMER behandelt werden
            //...
        }

        // CheckedExceptions können NUR gefangen werden, wenn die Möglichkeit besteht, dass sie entstehen
//        try {
//            // Hier taucht keine Exception auf
//        }
//        catch (IOException e) {
//            //...
//        }

        // Exception (ist auch Checked) ist als Elternklasse aller Exceptions eine Ausnahme
        try {
            // Hier taucht keine Exception auf
        }
        catch (Exception e) {
            //...
        }

        Exception e = new NullPointerException();
        System.out.println(e instanceof Exception);
        System.out.println(e instanceof RuntimeException);
        System.out.println(e instanceof NullPointerException);

        System.out.println(Math.PI);
        System.out.println(Math.pow(10, 2));

        System.out.println(PI);
        System.out.println(pow(10, 2));

        machWas("A", "B", "C");

        String[] arr = {"A", "B", "C"};
        machWas(arr);

        arr = new String[2];
        arr[1] = "Text";

        for(String s : arr)
            System.out.println(s);


        final int zahl = 100; // Kompiletime-Konstante

        final int andereZahl; // Runtime-Konstante
        andereZahl = 200;

    }

    static void machWas(String... arg) {
        System.out.println(Arrays.toString(arg));
    }

//    static void machWas(String[] arg) {
//        System.out.println(Arrays.toString(arg));
//    }
}
