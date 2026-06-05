package de.lubowiecki.collections;

import java.util.ArrayList;
import java.util.Objects;

public class CloneTest {

    public static void main(String[] args) {


        ArrayList<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker"));
        personen.add(new Person("Carol", "Danvers"));

        System.out.println(personen);

        // Die clone-Methode liefert immer ein Object
        ArrayList<Person> personen2 = (ArrayList<Person>) personen.clone();
        System.out.println(personen2);

        personen2.get(0).setVorname("Bruce"); // Änderung über personen2

        System.out.println();
        System.out.println(personen);
        System.out.println(personen2);

        System.out.println();

        Person p1 = personen.get(0);
        Person p2 = personen2.get(0);

        System.out.println(p1.equals(p2)); // Inhaltsvergleich
        System.out.println(p1 == p2); // Identität: Ist es das gleiche Objekt auf dem Heap?

        System.out.println();


        System.out.println(p1);
        System.out.println(p1.hashCode());
        Person p3 = new Person("Bruce", "Parker");
        System.out.println(p3);
        System.out.println(p3.hashCode());
        System.out.println("Gleicher Inhalt: " + p1.equals(p3));

        // Wenn eine Klasse keine eigene equals-Methode bereitstellt, wird die equals-Methode von Object verwendet.
        // Diese prüft nur die Identität

        System.out.println("Gleiches Objekt: " + (p1 == p3));

        System.out.println();

        String s1 = "Hallo";
        System.out.println(s1.hashCode());
        String s2 = new String("Hallo");
        System.out.println(s2.hashCode());
        System.out.println("Gleicher Inhalt: " + s1.equals(s2));
        System.out.println("Gleiches Objekt: " + (s1 == s2));

        // Eine eigene equals-Methode erklärt Java wie ein Inhaltsvergleich vorgenommen werden soll

    }
}

class Person {

    private String vorname;
    private String nachname;

    public Person(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    public String getVorname() {
        return vorname;
    }

    public void setVorname(String vorname) {
        this.vorname = vorname;
    }

    public String getNachname() {
        return nachname;
    }

    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    @Override
    public String toString() {
        return vorname + " " + nachname;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(vorname, person.vorname) && Objects.equals(nachname, person.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }
}