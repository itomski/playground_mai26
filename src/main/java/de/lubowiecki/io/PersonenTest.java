package de.lubowiecki.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class PersonenTest {

    private static final String FILE = "personen.ser";

    public static void main(String[] args) {

        List<Person> personen = new ArrayList<>();
        personen.add(new Person("Peter", "Parker", LocalDate.of(1995, 10, 5)));
        personen.add(new Person("Carol", "Danvers", LocalDate.of(1999, 1, 2)));
        writeToFile(personen);
    }

    private static void writeToFile(List<Person> liste) {
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(liste);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}

// implements Serializable = Person wird als serialisierbar markiert
class Person implements Serializable {

    private String vorname;
    private String nachname;
    private LocalDate geburtsDatum;

    public Person(String vorname, String nachname, LocalDate geburtsDatum) {
        this.vorname = vorname;
        this.nachname = nachname;
        this.geburtsDatum = geburtsDatum;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Person{");
        sb.append("vorname='").append(vorname).append('\'');
        sb.append(", nachname='").append(nachname).append('\'');
        sb.append(", geburtsDatum=").append(geburtsDatum);
        sb.append('}');
        return sb.toString();
    }
}
