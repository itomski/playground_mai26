package de.lubowiecki.basics;

public class StringTest {

    public static void main(String[] args) {

        String s1 = "Hallo String"; // Literal
        String s2 = new String("Hallo String"); // Konstruktor
        String s3 = "Hallo ".concat("String");
        System.out.println(s1);
        // Bei String basiert der HashCode auf dem Inhalt
        System.out.println(s1.hashCode());
        System.out.println(s2);
        System.out.println(s2.hashCode());
        System.out.println(s3);
        System.out.println(s3.hashCode());

        System.out.println(s1 == s2); // Referenzgleichheit
        System.out.println(s2 == s3); // Referenzgleichheit
        System.out.println(s1 == s3); // Referenzgleichheit


    }
}
