package de.lubowiecki.arrays;

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

    }
}
