package de.lubowiecki.test;

public class TestArrays1 {

    public static void main(String[] args) {

        char c = 65100;

//        while(false) {
//            System.out.println("123");
//        }

        if(false) {
            System.out.println("123");
        }

        boolean a;

        if(a = true) {
            System.out.println("...");
        }

        float f = 1f;
        f = .5f;

        Character c1 = new Character('c');
        c1 = 'c';
        Character c2 = Character.valueOf('C');

        char ch = 1000; // Ok
        int i = 1000;
        // ch = i; // Error

        byte b = 100; // Ok
        i = 100;
        // b = i; // Error


    }
}
