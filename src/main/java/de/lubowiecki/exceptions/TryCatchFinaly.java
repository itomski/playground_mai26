package de.lubowiecki.exceptions;

public class TryCatchFinaly {

    public static void main(String[] args) {

        // Darf nicht aleine stehen
//        try {
//            //...
//        }

        //OK
        try {
            //...
        }
        catch(Exception e) {

        }

        //OK
        try {
            //...
        }
        finally {

        }

        //OK
        try {
            //...
        } catch (Exception e) {
            //...
        }
        finally {

        }
    }
}
