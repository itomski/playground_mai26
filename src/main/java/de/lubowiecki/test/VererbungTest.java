package de.lubowiecki.test;

public class VererbungTest {

    public static void main(String[] args) {

        // Referenztyp: Animal - Sagt uns welche Methoden aufrufbar sind
        // Objekttyp: Cat - Instanzmethoden werden auf diesem Typ ausgeführt
        Animal v1 = new Cat();
        //v1 = new Dog();
        v1.sound();

        Object o;
        // Methoden von Object dürfen nicht als default Methoden in einem Interface eingebaut werden

        //I i = new I(); // Interface darf nicht instanziert werden
        I i = new I(){}; // Anonyme Klasse implementiert das Interface und wird sofort instanziert

    }
}

abstract class Animal {

    abstract void sound();

}

class Dog extends Animal {

    @Override
    void sound() {
        System.out.println("Wau Wau");
    }
}

class Cat extends Animal {

    @Override
    void sound() {
        System.out.println("Miau Miau");
    }
}


class NewAnimal {

//    public NewAnimal(int i) {
//    }
}

class NewCat extends NewAnimal {

    public NewCat() {
        //super(); // wird automatisch ausgeführt, es sei denn wir rufen selbst super() oder this() auf
    }
}

interface I {
}