package de.lubowiecki.basics;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class OptionalTest {

    private static List<String> namen = new ArrayList<>(List.of("Peter", "Bruce", "Carol", "Steve"));

    public static void main(String[] args) {

        // System.out.println(getName(4).toUpperCase());

        getName(10).ifPresent(System.out::println);

    }

//    public static String getName(int pos) {
//        try {
//            return namen.get(pos);
//        }
//        catch (IndexOutOfBoundsException e) {
//            return null;
//        }
//    }

    public static Optional<String> getName(int pos) {
        try {
            return Optional.of(namen.get(pos));
        }
        catch (IndexOutOfBoundsException e) {
            return Optional.empty();
        }
    }
}
