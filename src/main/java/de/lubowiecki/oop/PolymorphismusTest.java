package de.lubowiecki.oop;

import java.util.ArrayList;
import java.util.List;

public class PolymorphismusTest {


    public static void main(String[] args) {

        List<Flugobjekt> flughafen = new ArrayList<>();
        flughafen.add(new AirbusA340()); // AirbusA340 IS-A Flugobjekt
        flughafen.add(new Boeing757());
        flughafen.add(new Cessna());
        flughafen.add(new Ente());
        //flughafen.add(new String("...")); // Error: String IS-NOT Flugobjekt

        for(Flugobjekt fo : flughafen) {
            fo.kommunikationMitDemTower(); // wird polymorphisch auf dem Obejkttyp ausgeführt
        }
    }
}

// Abstrakte Klassen dürfen nicht direkt instanziert werden
// Können konkrete Methoden und Attribute enthalten
// Können abstrakte Methoden enthalten
abstract class Flugobjekt {

    abstract void kommunikationMitDemTower(); // Abstrakte Methoden MÜSSEN in der Kindklasse vollständig eingebaut werden

    abstract void landen(); // Eine abstrakte Methode erzwingt eine Implementierung

    abstract void starten();
}


class Boeing757 extends Flugobjekt {

    @Override
    void kommunikationMitDemTower() {
        System.out.println("Hallo Tower. Hier folgt die ID für Boeing 757 ... Over");
    }

    @Override
    void landen() {
        System.out.println("Landung");
    }

    @Override
    void starten() {
        System.out.println("Start");
    }
}

class AirbusA340 extends Flugobjekt {

    @Override
    void kommunikationMitDemTower() {
        System.out.println("Hallo Tower. Hier folgt die ID für Airbus A340 ... Over");
    }

    @Override
    void landen() {
        System.out.println("Landung");
    }

    @Override
    void starten() {
        System.out.println("Start");
    }
}

class Cessna extends Flugobjekt {

    @Override
    void kommunikationMitDemTower() {
        System.out.println("Moin Moin... ich wollte mal was fragen...");
    }

    @Override
    void landen() {
        System.out.println("Landung");
    }

    @Override
    void starten() {
        System.out.println("Start");
    }

}

class Ente extends Flugobjekt {

    // Alle Abstrakten Methoden der Elternklasse MÜSSEN eingebaut werden

    @Override
    void kommunikationMitDemTower() {
        System.out.println("Quak, Quak.... Quaaaaaaak");
    }

    @Override
    void landen() {
        System.out.println("Die Ente setzt auf.");
    }

    @Override
    void starten() {
        System.out.println("Die Ente nimmt Anlauf und breitet die Flügel aus... Flattert immer schneller...");
    }
}