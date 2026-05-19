package de.lubowiecki.kontrollstrukturen;

public class NewSwitch {

    public static void main(String[] args) {

        int i = 10;

        // -> verwendet ein automatisches berak nach jedem case
        switch (i) {
            case 10 -> System.out.println("Gut");
            case 20 -> System.out.println("Sehr gut");
            case 30 -> System.out.println("Noch besser");
            case 40 -> System.out.println("Top");
        }

        // Mit Rückgabe
        // Der Inhalt des case wird der Variable zugewiesen
       String s = switch(i) {
            case 10 -> "Gut";
            case 20 -> "Sehr gut";
            case 30 -> "Noch besser";
            case 40 -> "Top";
            default -> "Unbekannt";
        };

        System.out.println(s);
    }
}
