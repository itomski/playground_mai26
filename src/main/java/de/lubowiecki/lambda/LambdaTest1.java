package de.lubowiecki.lambda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.IntSupplier;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.stream.IntStream;

public class LambdaTest1 {

    public static void main(String[] args) {

        // Consumer: verbraucht/verarbeitet einen Wert
        Consumer<String> upper = s -> System.out.println(s.toUpperCase());
        Consumer<String> lower = s -> System.out.println(s.toLowerCase());

        List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Natasha", "Scott", "Steve"));

        //namen.forEach(upper);
        namen.forEach(lower);

        System.out.println("--------------");

        // Predicate: prüft einen Wert
        Predicate<String> startetMitB = s -> s.startsWith("B");
        namen.removeIf(startetMitB);
        System.out.println(namen);

        // s -> s + "ABC"; // Java weiß nicht, was das ist!

        System.out.println();

        Random rand = new Random();

        // Supplier: erzeugt einen Wert
        IntSupplier w6 = () -> rand.nextInt(6) + 1;

        IntStream.generate(w6)
                .limit(10)
                .forEach(i -> System.out.println(i));


    }
}
