package de.lubowiecki.basics;

public class ZahlenTest {

    public static void main(String[] args) {

        int i = 10;
        double erg = (i < 10) ? 10 : 11.0;

        System.out.println();

        System.out.println(10 % 3);
        System.out.println(10 % -3);

        System.out.println();

        System.out.println(-10 % 3);
        System.out.println(-10 % -3);

        int $ = 20;

        Integer ii = 10;

        switch(ii) {
            case 1:
                int j = 10;
                break;

            case 2:
                j = 20; // Variable j ist bereits deklariert
                break;

            case 3:
                j = 30;
                break;

            default:
        }
    }
}
