package de.lubowiecki.exceptions;

public class MethodTest {

    public static void main(String[] args) {
        System.out.println("START: Main");
        methodA();
        System.out.println("ENDE: Main");
    }

    public static void methodA() {
        System.out.println("START: A");
        try {
            methodB();
        } catch (Exception e) {
            System.out.println("Problem mit einer Null-Referenz");
        }
        System.out.println("ENDE: A");
    }

    public static void methodB() {
        System.out.println("START: B");
        methodC();
        System.out.println("ENDE: B");
    }

    public static void methodC() {
        System.out.println("START: C");

//        try {
            String n = null;
            System.out.println(n.toLowerCase());
//        }
//        catch (Exception e) { // Wird eine Exception behandelt, wird die Methode nicht abgebrochen
//            System.out.println("Problem mit einer Null-Referenz");
//        }

        System.out.println("ENDE: C");
    }

}
