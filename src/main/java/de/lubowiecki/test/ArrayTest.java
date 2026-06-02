package de.lubowiecki.test;

import java.util.Arrays;

public class ArrayTest {

    public static void main(String[] args) {

        // Frage 2
        char c = 63100;
        System.out.println(c);

        // Frage 4
        int[][] arr = new int[2][];
        System.out.println(Arrays.toString(arr));
        arr = new int[2][0];
        System.out.println(Arrays.deepToString(arr));

        arr = new int[2][];
        arr[0] = new int[3];
        arr[1] = new int[5];
        System.out.println(Arrays.deepToString(arr));

        // Sonstiges
        arr = new int[10][10];
        long l1 = 5;
        //System.out.println(arr[l1]); // Error: Index muss ein int sein
        byte b1 = 5;
        System.out.println(arr[b1]); // primitive widening von byte auf int

        // Frage 8
        // byte < short < int < long < float < double
        System.out.println(arr[(int)l1]); // Mit Cast möglich
        int[] arr2 = new int[(int)l1]; // Mit Cast möglich


        // Sonstiges
        int[] arr3 = {1,2,3}; // Array-Literal nur bei gleichzeitiger Deklaration möglich
        //arr3 = {1,2,3}; // Error
        arr3 = new int[]{1,2,3}; // Ok: Größe des Arrays wird NICHT in den [] Klammern vorgegeben - erzeugt ein neues Array
        //arr3 = new int[3]{1,2,3}; // Error
        arr3[2] = 12; // Auf Position 2 zuweisen

    }
}
