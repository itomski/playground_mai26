package de.lubowiecki.exceptions;

public class UncheckedTest {

    public static void main(String[] args) {
        System.out.println("START: Main");
        // Wenn die unchecked Exception bis in die Main-Methode nicht behandelt wurde,
        // wird das Programm abgebrochen
        methodA();
        System.out.println("ENDE: Main");
    }

    public static void methodA() {
        System.out.println("START: A");
        methodB();
        System.out.println("ENDE: A");
    }

    public static void methodB() {
        System.out.println("START: B");
        methodC();
        System.out.println("ENDE: B");
    }

    public static void methodC() {
        System.out.println("START: C");
        String n = null;
        // Uncheckd Exceptions, die nicht behandelt werden, brechen die aktuelle
        // Methode ab und werden automatisch zum Aufrufer dieser Methode weitergereicht
        System.out.println(n.toLowerCase());
        System.out.println("ENDE: C");
    }
}
