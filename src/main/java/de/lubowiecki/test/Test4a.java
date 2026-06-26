package de.lubowiecki.test;

public class Test4a {

    public static void main(String[] args) {

        StringBuilder sb = new StringBuilder("Whiz");
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.append("lab");
        sb.append('s');
        System.out.println(sb.capacity());
        System.out.println(sb.length());

        sb.setLength(7); // Schneidet den Inhalt zu, verändert aber nicht die capacity
        //sb.trimToSize();

        System.out.println(sb.capacity());
        System.out.println(sb.length());

        System.out.println(sb);
    }
}

class Xyz2 {

    class Inner {

    }
}