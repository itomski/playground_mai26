package de.lubowiecki.exceptions;

public class ExceptionReihenfolge {

    public static void main(String[] args) {

        try {
            int[] arr = new int[10];
            arr = null;
            System.out.println(arr[100]);
        }
//        catch (NegativeArraySizeException e) {
//            System.out.println("Negative Array-Größe");
//        }
//        catch (ArrayIndexOutOfBoundsException e) {
//            System.out.println("Falsche Position im Array");
//        }
        catch (NegativeArraySizeException | ArrayIndexOutOfBoundsException e) { // Multicatch
            System.out.println("Problem mit dem Array");
        }
        catch(Exception e) {
            System.out.println("Sonstiger Fehler");
        }
    }
}
