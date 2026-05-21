package de.lubowiecki.basics;

public class Pkw {

    int geschwindigkeit;

    // Verwendet die Methode Instanzvariablen oder Instanzmethoden,
    // dann darf sie NICHT statisch sein

    boolean gibGas(int kmh) {
        if(kmh > 0) {
            geschwindigkeit += kmh; // geschwindigkeit = geschwindigkeit + kmh
            return true;
        }
        return false;
    }
}
