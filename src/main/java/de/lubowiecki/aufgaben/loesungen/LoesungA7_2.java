package de.lubowiecki.aufgaben.loesungen;

public class LoesungA7_2 {

    public static void main(String[] args) {

        Rechner.add(10, 15.7);
        Rechner.add(17, 22);
        Rechner.multi(8, 18);
        Rechner.printProtokoll();

    }
}

class Rechner {

    private static String protokoll = "";

    private static final String TPL = "%.2f %s %.2f = %.2f \n";

    private Rechner() {
    }

    public static double add(double a, double b) {
        var erg = a + b;
        addToProtokoll(a, b, '+', erg);
        return erg;
    }

    public static double sub(double a, double b) {
        var erg =  a - b;
        addToProtokoll(a, b, '-', erg);
        return erg;
    }

    public static double div(double a, double b) {
        var erg = a / b;
        addToProtokoll(a, b, '/', erg);
        return erg;
    }

    public static double multi(double a, double b) {
        var erg = a * b;
        addToProtokoll(a, b, '*', erg);
        return erg;
    }

    private static void addToProtokoll(double a, double b, char operator, double erg) {
        // "a + b = erg \n"
        // "%f %s %f = %f \n"
        protokoll = String.format(TPL, a, operator, b, erg);
        //protokoll += "" + a + operator + b + " = " + erg + "\n"; // Auch ok!
    }

    public static void printProtokoll() {
        System.out.println(protokoll);
    }
}
