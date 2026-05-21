package de.lubowiecki.oop.fahrschule;

import java.time.LocalDate;

// Top-Level-Klasse dürfen nur public oder package-private sein
// Jede Klasse in Java ist automatisch eine Kindklasse von Object
public class Pkw {

    // Instanz und Klassenvariablen bekommen bei der Instanzierung default-Werte
    // Ohne Angabe eines Access-Modifiert wird automatisch package-private verwendet
    private String kennzeichen;
    private String marke;
    private String modell;
    private int baujahr;
    String kraftstoff = "Benzin"; // TODO: Auf ENUM umstellen
    String getriebe = "Schaltung"; // TODO: Auf ENUM umstellen
    double verbrauch;
    int leistung;
    String farbe;
    int anzahlRaeder;
    int anzahlTueren;
    int anzahlSitze;
    double kmStand;
    LocalDate hu;
    boolean verliehen;

    // Konstruktoren bauen Objekte
    // Wenn eigene Konstruktoren deklariert werden, stellt Java keine parameterlosen Default-Konstruktor mehr bereit

    public Pkw() {
    }

    public Pkw(String kennzeichen, String marke, String modell, int baujahr, String kraftstoff, String getriebe) {
//        this.kennzeichen = kennzeichen;
//        this.marke = marke;
//        this.modell = modell;
//        this.baujahr = baujahr;
        this(kennzeichen, marke, modell, baujahr); // Verwendet einen anderen Konstruktor DIESER Klasse
        // Wenn auf einen anderen Konstutor verwiesen wird, muss es die erste Anweisung sein
        System.out.println("C6");
        this.kraftstoff = kraftstoff;
        this.getriebe = getriebe;
    }

    public Pkw(String kennzeichen, String marke, String modell, int baujahr) {
        System.out.println("C4");
        this.kennzeichen = kennzeichen;
        this.marke = marke;
        this.modell = modell;
        this.baujahr = baujahr;
    }

    public String getKennzeichen() {
        return kennzeichen;
    }

    public void setKennzeichen(String kennzeichen) {
        if(kennzeichen.length() >= 8) // Nur zuweisen, wenn das Kennzeiche mind. 8 Zeichen hat
            this.kennzeichen = kennzeichen.toUpperCase();
    }

    public String getMarke() {
        return marke;
    }

    public void setMarke(String marke) {
        this.marke = marke;
    }

    public String getModell() {
        return modell;
    }

    public void setModell(String modell) {
        this.modell = modell;
    }

    public int getBaujahr() {
        return baujahr;
    }

    public void setBaujahr(int baujahr) {
        this.baujahr = baujahr;
    }

    // Destruktoren werden aufgerufen, wenn das Objekt vom Speicher entfernt wird
    // zwischenzeitlich Deprecated
    @Override
    protected void finalize() throws Throwable {
        System.out.println("UGHHHRRRRR...... Bin dann weg");
    }
}
