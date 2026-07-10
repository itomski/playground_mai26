package de.lubowiecki.test;

public class TestExceptions1 {

    public static void main(String[] args) {

        Integer i = Integer.valueOf("100");
        //String s = (String)i; // Kompiler-Error
        Object o = i; // Upcasting
        String s = (String)o; // ClassCastException
        s = i.intValue() + ""; // Ok
        s = i.toString(); // Ok


    }
}
