package de.lubowiecki.oop;

public class DiceCupTest {

    public static void main(String[] args) {

//        System.out.println(DiceCup.roll());
//        System.out.println(DiceCup.roll());
//        System.out.println(DiceCup.roll());
//        System.out.println(DiceCup.roll());
//        System.out.println(DiceCup.roll());

        // Deklariert eine Variable mit dem Namen s
        String s = greet("Peter"); // Aufruf der Methode
        System.out.println(s);

        // Überschreibt den Ihnalt von s
        s = greet("Bruce");
        System.out.println(s);

        s = greet("Carol");
        System.out.println(s);

        System.out.println(greet("Tony"));

        int res = add(15, 27);
        System.out.println(res);
        System.out.println(add(10, 7));
        System.out.println(add(-15, 22));
        System.out.println(add(18, 99));
    }

    // Definition einer Methode
    // Klassenmethode
    static String greet(String name) {
        return "Guten Tag " + name;
    }

    static int add(int zahl1, int zahl2) {
        return zahl1 + zahl2;
    }

}
