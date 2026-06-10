package de.lubowiecki.exceptions;

public class TryCatchFinally2 {

    public static void main(String[] args) {

        System.out.println(doSomething("Moin"));

        System.out.println(doSomething(null));

        try {

            try {
                //...
                throw new RuntimeException("...");
            } catch (RuntimeException e) {
                System.out.println("RuntimeException");
                // Versuch das Problem zu lösen
                //throw e; // Rethrow
                throw new RuntimeException(e); // e ist der Grund der neuen Exception

            } catch (Exception e) {
                System.out.println("Exception");
            }

        }
        catch (RuntimeException e) {
            System.out.println("Exception nach dem Rethrow");
        }


    }

    private static int doSomething(String text) {
        try {
            return text.length();
        }
        finally { // Wird IMMER ausgeführt
            // Hat finally ein return, dann überschreibt dieser den return der Methode und eventuell geworfene Exceptions
            return 0;
        }
    }
}
