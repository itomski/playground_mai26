package de.lubowiecki.patterns.builder;

public class FahrzeugTest {

    public static void main(String[] args) {

        Fahrzeug f = new Fahrzeug("HH:AB123", "VW", "Polo", "Blau");
        System.out.println(f);

        FahrzeugBuilder builder = new FahrzeugBuilder();
        builder.setMarke("Renault").setFarbe("Gelb").setModell("Zoe");

        Fahrzeug f2 = builder.setKennzeichen("HH:XY234").build();
        System.out.println(f2);

        Fahrzeug f3 = builder.setKennzeichen("HH:BZ345").build();
        System.out.println(f3);

        Fahrzeug f4 = builder.setKennzeichen("HH:AB997").setFarbe("Rot").build();
        System.out.println(f4);

    }
}
