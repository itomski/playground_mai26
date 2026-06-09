package de.lubowiecki.lambda;

public class FunctionalInterfaceTest {

    public static void main(String[] args) {

        MathOperation add = (a, b) -> a + b; // Lambda
        MathOperation div = (a, b) -> a / b; // Lambda
        System.out.println(add.execute(10, 15));
        runMethod(div, 22, 172);
    }

    public static void runMethod(MathOperation op, double a, double b) {
        System.out.println(op.execute(a, b));
    }
}

// FunctionalInterfaces haben NUR eine einzige abstrakte Methode
// SAM - Single Abstract Method

@FunctionalInterface // Prüft, ob das Interface die Regeln für ein FunctionalInterface erfüllt
interface MathOperation {

    double execute(double a, double b);

    // int execute(int a, int b); // Weitere abstrakte Methoden sind NICHT erlaubt
}
