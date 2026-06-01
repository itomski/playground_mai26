package de.lubowiecki.arrays;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Array2dTest {

    int i; // Standard: 0
    double j; // Standard: 0.0
    String s; // Standard: null
    Scanner s2; // Standard: null

    public static void main(String[] args) {

        int[][] zahlen;
        int[] zahlen1, zahlen2[]; // zahlen1 = 1d Array, zahlen2 = 2d Array
        int zahlen3, zahlen4[]; // zahlen3 = int, zahlen4 = 1d Array

        // Nur bei gleichzeitiger Deklaration der Variable erlaubt
//        zahlen = {
//                {1,2,3},
//                {4,5},
//                {6,7,8,9}
//        };

        zahlen = new int[][]{
                {1,2,3},
                {4,5},
                {6,7,8,9}
        };

        zahlen = new int[5][4];
//        {
//            0: {0:0, 1:0, 2:0, 3:0},
//            1: {0:20, 1:0, 2:0, 3:0},
//            2: {0:0, 1:0, 2:0, 3:0},
//            3: {0:0, 1:0, 2:0, 3:10},
//            4: {0:0, 1:0, 2:0, 3:0},
//        }

        zahlen[3][3] = 10;
        zahlen[1][0] = 20;

        System.out.println(zahlen[0]);

        for (int i = 0; i < 4; i++) {
            System.out.print(zahlen[0][i] + " ");
        }

        System.out.println();

        for (int i :  zahlen[0]) {
            System.out.print(i + " ");
        }

        System.out.println(); // Leerzeile

        System.out.println(Arrays.toString(zahlen[1]));

        System.out.println();

        for (int i = 0; i < zahlen.length; i++) {
            for (int j = 0; j < zahlen[i].length; j++) {
                System.out.print(zahlen[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println();

        for (int[] zeile : zahlen) {
            for(int zelle : zeile) {
                System.out.print(zelle + " ");
            }
            System.out.println();
        }

        char[][] zeichenSammlung = {{'A','B'}, {'D','E','8'},{}};
        //System.out.println(zeichenSammlung[3][2]); // ArrayIndexOutOfBoundsException

        int[][] arr = new int[2][0]; //{{},{}}
        arr = new int[2][]; //{null, null}
        //new int[3]; {0, 0, 0}
        //new double[3]; {0.0, 0.0, 0.0}
        //new String[3]; {null, null, null}

        System.out.println();

        int[] andereZahlen = {1,2,3,4};
        System.out.println(Arrays.toString(andereZahlen));
        //andereZahlen = new int[5]; // Erzeugt ein neues Array, verliert alle Werte
        andereZahlen = Arrays.copyOf(andereZahlen, 5); // Erzeugt ein neues Array, übernimmt die alten Elemente
        andereZahlen = Arrays.copyOf(andereZahlen, 5); // Erzeugt ein neues Array, übernimmt die alten Elemente
        System.out.println(Arrays.toString(andereZahlen));

        double[][] preise = {{10.5, 20.5}, {10.7, 20.7}};
        System.out.println(Arrays.toString(preise));
        System.out.println(Arrays.deepToString(preise)); // Bei mehrdimensionalen Arrays

        System.out.println();

        int[] zahlen5 = {2,7,-18,22,9,8};
        System.out.println(Arrays.toString(zahlen5));
        Arrays.sort(zahlen5);
        System.out.println(Arrays.toString(zahlen5));

        System.out.println();

        String[] namen = {"bruce", "Peter", "Bruce", "Tony", "Carol"};
        Arrays.sort(namen); // natürliche Ordnung
        System.out.println(Arrays.toString(namen));

        int[] zahlen6 = new int[10]; // 10x 0
        Arrays.fill(zahlen6, 7); // Füllt alle Array-Positionen mit 7
        System.out.println(Arrays.toString(zahlen6));

        // ArrayIndexOutOfBounds
        //System.out.println(zahlen6[-1]); // Index wird erst zur Laufzeit geprüft

        int[] zahlen7 = {1,3,7,19,22,100,900};
        // binarySearch setzt eine Sortierung voraus
        int pos = Arrays.binarySearch(zahlen7, 1);
        System.out.println("Gefunden an Pos. " + pos);



    }
}
