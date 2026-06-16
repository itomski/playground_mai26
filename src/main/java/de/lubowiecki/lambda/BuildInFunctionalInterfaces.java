package de.lubowiecki.lambda;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.function.*;

public class BuildInFunctionalInterfaces {

    public static void main(String[] args) {

        // void accept(T t);
        Consumer<Integer> ausgabe1 = i -> System.out.print(i); // i ist ein Integer
        Consumer<Integer> ausgabe1b = i -> System.out.print("..."); // i ist ein Integer
        Consumer<Integer> ausgabe1c = i -> System.out.println("###"); // i ist ein Integer

        // für primitive ints
        // Nur für int, long und double verfügbar
        IntConsumer ausgabe2 = i -> System.out.println(i); // i ist ein int

        ausgabe1.andThen(ausgabe1b).andThen(ausgabe1c).accept(100); // andThen verbindet 2 Consumer zu einem
        ausgabe2.accept(200);

        System.out.println("-----------");

        final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        // R apply(T t);
        Function<String, LocalDate> konverter1 = s -> LocalDate.parse(s, DATE_FMT);
        LocalDate ld = konverter1.apply("25.07.2025");
        System.out.println(ld);

        Function<Double, Double> zumQuadrat = z -> z * z;
        System.out.println(zumQuadrat.apply(15.0));

        System.out.println("-----------");

        // R apply (T t, U u)
        //BiFunction<Double, Double, Double> add = (a, b) -> a + b;

        // BinaryOperator: Beide Eingangstypen und der Rückgabetyp sind gleich
        // T apply (T t1, T t2)
        BinaryOperator<Double> add = (a, b) -> a + b;
        System.out.println(add.apply(10.7, 22.0));

        //System.out.println(add.apply(10, 22)); // Error: kein primitiv Widening
        // double applyAsDouble(double a, double b)
        DoubleBinaryOperator add2 = (a, b) -> a + b;
        System.out.println(add2.applyAsDouble(10, 22)); // primitive Widening erlaubt

        System.out.println("-----------");

        // R get ()
        Supplier<Integer> w6 = () -> (int)(Math.random() * 6) + 1;
        System.out.println(w6.get()); // Liefert ein Integer Objekt
        System.out.println(w6.get());
        System.out.println(w6.get());
        System.out.println(w6.get());

        // int getAsInt()
        IntSupplier w10 = () -> (int)(Math.random() * 10) + 1;
        System.out.println(w10.getAsInt()); // Liefert einen primitiven int
        System.out.println(w10.getAsInt());
        System.out.println(w10.getAsInt());

        System.out.println("-----------");

        // boolean test(T t)
        Predicate<Integer> kleinerAls10 = w -> w < 10;
        System.out.println(kleinerAls10.test(100));
        System.out.println(kleinerAls10.test(5));

        // boolean test(int value)
        IntPredicate groesserAls25 = w -> w > 25;
        System.out.println(groesserAls25.test(42));

    }
}
