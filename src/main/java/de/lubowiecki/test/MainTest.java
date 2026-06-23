package de.lubowiecki.test;

public interface MainTest {

    public static void main(String[] args) {
        System.out.println("Hallo 1");
    }

    interface WasAnderes {
        public static void main(String[] args) {
            System.out.println("Hallo 2");
        }
    }
}

class Xyz {

    public static void main(String[] args) {
        System.out.println("Hallo 3");
    }
}
