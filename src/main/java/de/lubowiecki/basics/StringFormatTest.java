package de.lubowiecki.basics;

public class StringFormatTest {

    public static void main(String[] args) {

        /*
        %s = String
        %f = Floatingpoint
        %d = Decimal
        %n = Zeilenumbruch
         */


        System.out.printf("\tDas \"ist\" %s \\ \n", "Peter"); // Sofortige Ausgabe
        String erg = String.format("Das ist %s \n", "Peter");

        final String ROW_TPL = "| %-10s | %-12s | %5s | \n";

        System.out.printf(ROW_TPL, "NAME", "STADT", "ALTER");
        System.out.println("-------------------------------------");
        System.out.printf(ROW_TPL, "Peter", "Hamburg", 25);
        System.out.printf(ROW_TPL, "Bruce", "München", 32);
        System.out.printf(ROW_TPL, "Carol", "Köln", 44);
        System.out.printf(ROW_TPL, "Steve", "Hildesheim", 92);
        //System.out.printf(ROW_TPL, "Steve", "BlödeRödelDuddelheim", 92);

        System.out.printf("%010d \n", 10);
        System.out.printf("%.2f \n", 10d);



    }
}
