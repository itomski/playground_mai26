package de.lubowiecki.kontrollstrukturen;

public class TerTest {

    public static void main(String[] args) {

        int alter = 15;

        //System.out.println(if(alter < 16) "zu jung"; else "ok");
        String ausgabe;

        if(alter < 16)
            ausgabe = "zu jung";
        else
            ausgabe = "ok";

        System.out.println(ausgabe);

        System.out.println(alter < 16 ? "zu jung" : "ok");

        // Schreibt in eine Variable
        ausgabe = alter < 16 ? "zu jung" : "ok";
        ausgabe = alter < 16 ? "zu jung" : alter > 100 ? "zu spät" : "passt";

    }
}
