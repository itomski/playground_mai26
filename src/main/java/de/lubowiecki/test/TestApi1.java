package de.lubowiecki.test;

import java.time.LocalDate;
import java.util.*;

public class TestApi1 {

    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        String[] arr = new String[2];

        // ist das Array groß genug, wird es benutzt. Ist es zu klein, wild ein passendes erstellt
        arr = list.toArray(arr); // Parameter sagt der Methode, welchen Typ sie zurückgeben soll

        //Object[] arr2 = list.toArray(); // Liefert ein Object-Array
        System.out.println(Arrays.toString(arr));


        LocalDate ld = LocalDate.of(1712, 2, 30);
        System.out.println(ld);

    }
}
