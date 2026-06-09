package de.lubowiecki.oop;

public class FinalTest {

    public static void main(String[] args) {

    }
}

final class FinalClass {

}

class MyClass {

    public final String generateStr() {
        return "1234567";
    }
}

// Error: Von einer Finalen Klasse kann NICHT geerbt werden
//class NextClass1 extends FinalClass {
//}

//class NextClass2 extends String { // String ist final
//}

class NextClass3 extends MyClass {

//    @Override
//    public String generateStr() { // Methode ist in der Eleternklasse final und darf NICHT überschrieben werden
//        return "789101112";
//    }
}
