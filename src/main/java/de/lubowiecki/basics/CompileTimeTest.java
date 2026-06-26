package de.lubowiecki.basics;

import java.util.function.Predicate;

public class CompileTimeTest {

    public static void main(String[] args) {

        final boolean b1 = true;

//        while(b1) {
//
//        }

        //System.out.println("Moin");

        Boolean b = Boolean.parseBoolean("TruE_");
        System.out.println(b);

        System.setProperty("test1", "trUe");
        b = Boolean.getBoolean("test1"); // Ist die gewünschte System-Property mit true gefüllt?
        System.out.println(b);

        // boolean test(T t);
        Predicate<String> pred;


        byte b2 = 100;

        switch(b2) {

            case 100:
                break;

            case 120:
                break;

//            case 150: // Wert ist zu groß für byte
//                break;

        }
    }
}
