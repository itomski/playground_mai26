package de.lubowiecki.exceptions;

public class EigeneExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println(checkAlter(25));
            System.out.println(checkAlter(-25));
            System.out.println(checkAlter(125));
            System.out.println(checkAlter(15));
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("--------------");

        try {
            System.out.println(checkNextAlter(25));
            //System.out.println(checkNextAlter(-25));
            //System.out.println(checkNextAlter(125));
            System.out.println(checkNextAlter(15));
        }
        catch (WertUngueltigException e) {
            System.out.println("Ungültiger Wert");
        }
        catch (AlterZuHochException e) {
            System.out.println("Der Wert ist zu hoch...");
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    public static boolean checkAlter(int alter) throws Exception {

        // Bei checked Exceptions IMMER: handle or declare

        if(alter <= 0) {
            throw new Exception("Alter ist ungültig."); // Checked
        }
        else if (alter < 16) {
            return false;
        }
        else if (alter < 100) {
            return true;
        }
        else {
            throw new Exception("Das Alter ist zu hoch."); // Checked
        }
    }

    public static boolean checkNextAlter(int alter) throws Exception {

        // Bei checked Exceptions IMMER: handle or declare
        if(alter <= 0) {
            throw new WertUngueltigException(); // Checked
        }
        else if (alter < 16) {
            return false;
        }
        else if (alter < 100) {
            return true;
        }
        else {
            throw new AlterZuHochException(); // Checked
        }
    }
}

// Eigene Exceptions sind Klassen, die bereits von vorhandenen Exceptions abgeleitet sind

// Checked, da von einer CheckedException abgeleitet
class WertUngueltigException extends Exception {
}

class AlterZuHochException extends Exception {
}
