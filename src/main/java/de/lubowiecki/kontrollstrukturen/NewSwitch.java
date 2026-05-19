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
    }
}
