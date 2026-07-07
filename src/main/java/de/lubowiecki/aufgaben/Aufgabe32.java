package de.lubowiecki.aufgaben;

import java.util.List;

public class Aufgabe32 {

    // Schreibe 2 Implementierungen als Lambdas pro Interface
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