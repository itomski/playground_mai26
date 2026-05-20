package de.lubowiecki.basics;

public class MainTest {

    // Klassenmethode
    // args sind Programmstart-Parameter
    // String[] = String-Array = Sammlung von Strings (Zeichenketten)
    //public static void main(String[] xyz) {
    public static void main(String... xyz) { // ... VarArgs Alternative
        System.out.println("A");

        for(String val : xyz) {
            System.out.println(val);
        }

        System.out.println();
        add(); // VarArgs = Anzhal der Werte kann bei 0 bis n liegen
        add(1, 5);
        add(17, 22, 19, 100, -20, 33);
        // add(17, 22, 19, 100, -20, 33, "Moin"); // Error: VarArg-Parameter haben alle den gleichen Typ

    }

    // Einfach nur eine Methode - Kein Programmeinstieg
    public static void main() {
        System.out.println("B");
    }

    public static void add(int... zahlen) { // zahlen = Sammlung (Array) von Werten
        int sum = 0;
        for(int val : zahlen) {
            sum += val; // sum = sum + val;
        }
        System.out.println(sum);
    }
}
