package de.lubowiecki.exceptions;

public class ExceptionTest {

    public static void main(String[] args) {

        System.out.println("START");
        //int[] arr = new int[-10]; // NegativeArraySizeException
        //System.out.println(arr[10]); // ArrayIndexOutOfBoundsException

        String s = null;
        // System.out.println(s.toLowerCase()); // NullPointerException

        Object[] arrObj = new Integer[10];
        // arrObj[2] = "Moin"; // ArrayStoreException

        int i = Integer.parseInt("ABC"); // NumberFormatException

        System.out.println("ENDE");
    }
}
