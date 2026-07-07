package de.lubowiecki.lambda;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class LambdaTest3 {

    public static void main(String[] args) {

        // Predicate<T>: boolean test(T t)

        Predicate<String> istPeter = n -> n.equalsIgnoreCase("Peter");

        Predicate<Integer> istKleiner100 = i -> i < 100;

        // Lambda kann auch eine Variable von außerhalb des Lambdas verwenden
        // Bei lokalen Variablen muss sie final oder effektiv final sein
        // effektiv final = nicht final aber ändert sich nicht
        int mindAlter = 20;
        Predicate<Integer> istAelterAls20 = i -> i > mindAlter;
        // mindAlter = 25;

        Predicate<LocalDate> istInDerZukunft = datum -> datum.isAfter(LocalDate.now());

        System.out.println(istPeter.test("Scott"));
        System.out.println(istKleiner100.test(25));
        System.out.println(istAelterAls20.test(15));
        LocalDate ld = LocalDate.of(2028, 5, 17);
        System.out.println(istInDerZukunft.test(ld));

        // Arrays.asList und List.of erzeugen fixed size Listen
        List<Integer> zahlen = new ArrayList<>(Arrays.asList(10, 15, 125, 22,5, 8, 19, 100, 27,-2));

        System.out.println(zahlen);
        //zahlen.removeIf(istKleiner100);
        //zahlen.removeIf(zahl -> zahl == 8);
        zahlen.removeIf(zahl -> zahl > 15 && zahl < 75);
        System.out.println(zahlen);

    }
}
