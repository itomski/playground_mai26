package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayProblems {

    public static void main(String[] args) {

        int[][] arr = new int[2][]; // {null, null}
        // System.out.println(arr[0][1]); // NullPointerException
        // Arrays.sort(arr[0]); // NullPointerException

        // arr = new int[2][-5]; // NegativeArraySizeException

        //System.out.println(arr[3][1]); // ArrayIndexOutOfBoundsException

        // Bei Objekten kein primitive widening!!!!!
        // double[] dblArr = new int[3]; // Error

        // Upcasting: Alle Klassen in Java sind Kindklassen von Object
        Object obj = new int[3];

        Object[] oArr = new Integer[3];
        oArr[0] = "Moin Moin"; // ArrayStoreException


        String s = null;
        System.out.println(s.toLowerCase());


    }
}
