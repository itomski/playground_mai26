package de.lubowiecki.collections;

import de.lubowiecki.patterns.builder.Fahrzeug;

import java.util.*;

public class ListTest {

    public static void main(String[] args) {

        // Eine Collection ohne einer Typ-Vorgabe nimmt Objects auf
        ArrayList zeug = new ArrayList();
        zeug.add("Peter"); // Nimmt ein Element auf
        zeug.add(2100); // Autoboxing von int auf Integer (Wrapper)
        zeug.add(new Fahrzeug("HH:AB:123", "VW", "Polo", "Rot"));

        // Standard Größe = 10
        ArrayList<String> namen = new ArrayList<>(); // Der generische Typ von der linken Seite wird bei <> auf der rechten Seite übernommen
        ArrayList<String> nameNext = new ArrayList<String>(); // Auch Ok

        namen.add("Peter");
        //namen.add(123); // Error: Integer ist kein String!
        namen.add("Carol");
        namen.add("Tony");
        namen.add("Bruce");
        namen.add("Natasha");
        namen.add("Scott"); // ArrayList vergrößert sich automatisch

        System.out.println(namen.size()); // Anzahl Elemente

        System.out.println(namen); // bei Ausgabe wird automatisch toString verwendet

        // Ausgabe
        for (int i = 0; i < namen.size(); i++) {
            System.out.println(namen.get(i)); // Index der Liste startet wie beim Array bei 0
        }

        System.out.println("--------------");

        for(String name : namen) {
            System.out.println(name);
        }

        System.out.println("--------------");

        Iterator<String> itr = namen.iterator();
        while(itr.hasNext()) {
            System.out.println(itr.next());
        }

        System.out.println("--------------");

        //namen.add("Steve"); // Ans Ende hinzufügen
        namen.add(1, "Steve"); // An gewünschter Position hinzufügen

        namen.forEach(System.out::println); // Mit Methoden-Referenz

        System.out.println("--------------");

        //ArrayList<String> namen2 = new ArrayList<>(Arrays.asList("Peter", "Bruce", "Carol"));
        ArrayList<String> namen2 = new ArrayList<>(List.of("Peter", "Bruce", "Carol")); // Ab Java 9
        namen2.addAll(List.of("Steve", "Natasha", "Scott"));

        System.out.println(namen2);
        System.out.println(namen2.size());
        namen2.remove("Steve"); // Entfernt Steve aus der Liste
        namen2.remove(0); // Entfernt das Element auf dem Index 0
        System.out.println(namen2);
        System.out.println(namen2.size());
        //System.out.println(namen2.get(4)); // IndexOutOfBoundsException
        namen2.add(4, "Peter"); // Ok: Nächster freier Index
        //namen2.add(10, "Steve"); // IndexOutOfBoundsException
        System.out.println(namen2);
        namen2.set(2, "Unbekannt"); // Element an gewünschter Position ersetzen
        System.out.println(namen2);

        System.out.println("--------------");

        // Seit Java 8
        namen2.forEach(System.out::println); // Nicht Prüfungsrelevant: Führt für jedes Element eine Aktion aus

        System.out.println("--------------");

        namen2.replaceAll(n -> n.toUpperCase()); // Nicht Prüfungsrelevant: Ersetzt jedes Element auf gewüschte Weise
        System.out.println(namen2);

        System.out.println("--------------");

        namen2.add("hans");
        namen2.add(3, "aNNA");

        System.out.println(namen2);
        namen2.removeIf(n -> n.charAt(0) > 96 && n.charAt(0) < 123); // Verwendet ein Predicate
        System.out.println(namen2);

        // Genereische Typen sind IMMER komplex
        // Bei primitiven werden die Wrapper-Typen verwendet

        List<Integer> zahlen = new ArrayList<>();
        zahlen.add(100); // Autoboxing von int auf Integer
        zahlen.add(10);
        zahlen.add(1);
        zahlen.add(10_000);
        System.out.println(zahlen);

        zahlen = new LinkedList<>(zahlen); // Switch von ArrayList zu LinkedList
        zahlen = new ArrayList<>(zahlen); // Switch von LinkedList zu ArrayList

        // List
        // Arbeitet mit einem Index
        // Sind geordnet aber nicht sortiert (Einfügereihenfolge)




    }
}
