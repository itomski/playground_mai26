package de.lubowiecki.arrays;

import java.util.Arrays;

public class ArrayTest3 {

    public static void main(String[] args) {

        Person[] personen = new Person[20];

        personen[0] = new Person("Peter", "Parker");
        personen[1] = new Person("Bruce", "Banner");
        personen[2] = new Person("Carol", "Danvers");
        personen[3] = new Person("Scott", "Lang");

        //System.out.println(Arrays.toString(personen));

        for(Person p : personen) {
            if(p != null)
                System.out.println(p.getVorname() + " " + p.getNachname());
                // Ausführen von Methoden oder Attributen auf null führt zu einer NullPointerException
        }

        System.out.println();

        // Dynamisch zuweisen

        final int maxAnzahl = 3;
        int count = 0;

        Person[] personen2 = new Person[maxAnzahl];

        if(count < maxAnzahl) {
            personen2[count] = new Person("Peter", "Parker");
            count++;
        }

        if(count < maxAnzahl) {
            personen2[count] = new Person("Bruce", "Banner");
            count++;
        }

        if(count < maxAnzahl) {
            personen2[count] = new Person("Carol", "Danvers");
            count++;
        }

        if(count < maxAnzahl) {
            personen2[count] = new Person("Scott", "Lang");
            count++;
        }
        else {
            System.out.println("Array schon voll");
        }

        for(Person p : personen2) {
            if(p != null)
                System.out.println(p.getVorname() + " " + p.getNachname());
            // Ausführen von Methoden oder Attributen auf null führt zu einer NullPointerException
        }
    }
}
