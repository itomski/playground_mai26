package de.lubowiecki.aufgaben;

import java.util.Arrays;
import java.util.List;

public class Aufgabe32 {

    public static void main(String[] args) {

        // Implementierung der abstrakten Methode doSomething
        I1 i1 = (a, b) -> a + b;
        I1 ii1 = (double a, double b) -> a * b;

        System.out.println(i1.doSomething(10, 15));
        double erg = i1.doSomething(10, 15);

        I2 i2 = () -> List.of("Peter", "Bruce", "Max"); // Seit Java 9
        I2 ii2 = () -> Arrays.asList("Peter", "Bruce", "Max"); // Davor
        System.out.println(i2.getNames());


        // T change(T eingabe);
        // Bei einem einzigen Parameter kann die Klammer weggelassen werden!
        I3<String> i3 = s -> s.toUpperCase();
        // Wird der Paremetertyp dazugeschrieben MUSS die Klammer wieder mitgeschrieben werden!
        I3<Integer> ii3 = (Integer i) -> i * 100;
        System.out.println(ii3.change(5));

        I4 checkStr = s -> s.startsWith("P");
        System.out.println(checkStr.check("Hallo"));
        System.out.println(checkStr.check("Peter"));

        I5<String> i5 = s -> s.length() > 0;
        I5<Integer> ii5 = i -> i > 100;

        System.out.println(i5.check("Moin"));
        System.out.println(ii5.check(25));

        System.out.println();

        List<String> namen = List.of("Peter", "Bruce", "Carol", "Natasha", "Steve");
        I4 istBruce = n -> n.equalsIgnoreCase("bruce");

        doTheJob(namen, istBruce);

        System.out.println();

        doTheJob(namen, n -> n.length() > 5);

    }

    // Schreibe 2 Implementierungen als Lambdas pro Interface

    static void doTheJob(List<String> liste, I4 checker) {

        for(String item : liste) {
            System.out.println(checker.check(item));
        }
    }
}

@FunctionalInterface
interface I1 {
    double doSomething(double a, double b);
}

@FunctionalInterface
interface I2 {
    List<String> getNames();
}

@FunctionalInterface
interface I3<T> {
     T change(T eingabe);
}

@FunctionalInterface
interface I4 {
    boolean check(String text);
}

// Wie ein Predicate
@FunctionalInterface
interface I5<T> {
    boolean check(T attr);
}