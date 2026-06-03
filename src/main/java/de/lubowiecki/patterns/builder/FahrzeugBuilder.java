package de.lubowiecki.patterns.builder;

public class FahrzeugBuilder {

    private String kennzeichen = "";
    private String marke = "";
    private String modell = "";
    private String farbe = "";

    public FahrzeugBuilder setKennzeichen(String kennzeichen) {
        this.kennzeichen = kennzeichen;
        return this;
    }

    public FahrzeugBuilder setMarke(String marke) {
        this.marke = marke;
        return this;
    }

    public FahrzeugBuilder setModell(String modell) {
        this.modell = modell;
        return this;
    }

    public FahrzeugBuilder setFarbe(String farbe) {
        this.farbe = farbe;
        return this;
    }

    public Fahrzeug build() {
        return new Fahrzeug(kennzeichen, marke, modell, farbe); // Erzeugt das nicht veränderbare Fahrzeug
    }
}
