package de.lubowiecki.oop;

public class OverloadingTest {

    public static void main(String[] args) {

        OverloadingTest ot = new OverloadingTest();

        short s = 100;
        ot.compute(s);

        // 1. Methode mit genau passenden Parameter-Typ
        // 2. primitive widening / Narrowing kann nicht automatisch erfolgen
        // 3. Autoboxing zum gleichen Wrapper / Nur ein komplex Widening möglich
        // 4. Komplex widening
        // 5. VarArgs

    }

    private void compute(byte value) {
        System.out.println("byte");
    }

//    private void compute(short value) {
//        System.out.println("short");
//    }
//
//    private void compute(int value) {
//        System.out.println("int");
//    }

//    private void compute(double value) {
//        System.out.println("double");
//    }

    // byte < short < int < long < float < double
    // Bei Wrappertypen sind alle Wrapper gleichwertig und Kindklassen von Number
    // Komplex Widening heißt, bewegung vom Kind- zum Elterntyp

//    private void compute(Short value) { // Wrapper
//        System.out.println("Short Wrapper");
//    }

    private void compute(Integer value) {
        System.out.println("Integer Wrapper");
    }

    private void compute(Number value) { // Number ist die Elternklasse aller Wrapper
        System.out.println("Number Wrapper");
    }

//    private void compute(double... value) { // VarArg
//        System.out.println("double VarArg");
//    }
}
