package de.lubowiecki.patterns.builder;

public class Fahrzeug {

    private final String kennzeichen;
    private final String marke;
    private final String modell;
    private final String farbe;

    public Fahrzeug(String kennzeichen, String marke, String modell, String farbe) {
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.farbe = farbe;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Fahrzeug{");
        sb.append("kennzeichen='").append(kennzeichen).append('\'');
        sb.append(", marke='").append(marke).append('\'');
        sb.append(", modell='").append(modell).append('\'');
        sb.append(", farbe='").append(farbe).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
