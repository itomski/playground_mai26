package de.lubowiecki.aufgaben;

import java.util.Iterator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.IntStream;

public class Aufgabe33 {

    /*
    Schreibe 4 Implementierungen für das Predicate
    1 für Strings
    1 für Doubles
    1 für Fahrzeuge (Fahrzeug Klasse muss erzeugt werden)
    1 für Listen von Zahlen (Prüfung ob ein bestimmter Wert iun der Liste vorkommt)
    Teste die Predicates
    */

    public static void main(String[] args) {

        IntStream.generate(() -> (int)(Math.random() * 100) + 1) // IntSupplier: int getAsInt()
                .filter(i -> i < 75) // IntPredicate: boolean test(int i)
                .limit(100)
                .mapToDouble(i -> i * 5)
                .forEach(d -> System.out.printf("%.2f \n", d)); // DoubleConsumer: void accept(int d)

        Predicate<String> pred1 = w -> w.startsWith("Abc");

        Predicate<String> pred2 = Aufgabe33::check; // Methodenreferenz = Methode macht das, was das Predicate macht

        System.out.println();

        List<String> namen = List.of("Peter", "Bruce", "Carol");
        namen.forEach(n -> System.out.println(n));

        System.out.println();

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println();

        System.out.println();
        namen.forEach(System.out::println);

        System.out.println();
        namen.forEach(Aufgabe33::megaPrint);

        Predicate<String> pred3 = s -> s.toLowerCase().equals("abc"); // Generischer Typ weist auf String hin

        // Wird ein generischer Typ nicht angegeben, wird der RAW-Typ verwendet (meistens Object)
        // Predicate pred4 = s -> s.toLowerCase().equals("abc"); // Fehlender generischer Typ weist auf Object hin

        // Wegen dem Bound ist der RAW-Typ Number
        NextPredicate pred5 = s -> s.intValue() > 0;

    }

    static boolean check(String str) {
        return str.startsWith("Abc");
    }

    static void megaPrint(String str) {
        System.out.println("###" + str.toUpperCase() + "###");
    }
}

interface NextPredicate<T extends Number> {

    boolean test(T t);

}
