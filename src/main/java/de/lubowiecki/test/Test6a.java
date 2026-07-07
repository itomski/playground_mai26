package de.lubowiecki.test;

import java.util.function.Predicate;

public class Test6a {

    private static int zahl = 100;
    // private int zahl = 200; // Darf nicht gleicht, wie eine statische Variable heißen

    public static void main(String[] args) {

        int zahl = 300;
        if(true) {
            //int zahl = 400; // Redeklaration einer lokalen Variable = Error
        }

        StringBuilder sb = new StringBuilder("1234567890");
        sb.setLength(5);
        System.out.println(sb);
        sb.setLength(10);
        System.out.println(sb);
        System.out.println(sb.length());


        // boolean test(String t);
        // Predicate<String> pred = (s) -> s == "Summer" ? "Spring" : "Autumn"; // Error. return MUSS boolean sein
        Predicate<String> pred1 = (s) -> s == "Summer";
        Predicate<String> pred2 = s -> s == "Summer";
        Predicate<String> pred3 = (String s) -> s == "Summer";
        Predicate<String> pred4 = s -> {
            return s == "Summer";
        };

        Xyz4[] arr = {new Xyz4(), new Xyz4()};

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Xyz4(); // Überschreibt die Position im Array mit einem neuen Objekt
        }

        for (Xyz4 a : arr) {
            a = new Xyz4(); // Versetzt die Referenz a auf ein neues Objekt
        }

        Object[] arr2 = new String[10];


        boolean bankrupt = true;
//        do {
//            System.out.println("enjoying shopping");
//            bankrupt = false;
//        } while (!bankrupt);

        //Roamable r = (Tablet)new Phone(); // ClassCastException

        Object o = new String();

        if(o instanceof String)
            System.out.println("STR");

        if(o instanceof Number)
            System.out.println("NO");


        String[ ] sts = {"A","B","C"};
        for (String i : sts) {
            if(true) continue;
            System.out.print(i);
        }

        final boolean ok;
        ok = true;

        while(ok) {
        }
        System.out.print("A");


    }
}

class Xyz4 {
    String name = "Text";
}

interface Roamable{}
class Phone {}
class Tablet extends Phone implements Roamable {
}
