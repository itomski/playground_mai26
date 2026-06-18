package de.lubowiecki.collections;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetTest {

    public static void main(String[] args) {

        // Unsortierte Menge
        Set<LocalDateTime> cal = new HashSet<>();

        cal.add(LocalDateTime.now());
        cal.add(LocalDateTime.of(2000, 10, 15, 12, 30));
        cal.add(LocalDateTime.now().plusDays(5));
        cal.add(LocalDateTime.now().plusWeeks(7));
        cal.add(LocalDateTime.of(2000, 10, 15, 12, 30));
        cal.add(LocalDateTime.now().minusHours(17));

        System.out.println(cal);

        TreeSet<LocalDateTime> nextCal = new TreeSet<>(cal);
        System.out.println(nextCal);

        System.out.println();

        // TreeSet ist eine IMMER sortierte Menge
        TreeSet<Termin> termine = new TreeSet<>();
        termine.add(new Termin(LocalDateTime.now(), "Essen mit Peter", "Besprechung seines neuen Werbe-Kampagne"));
        termine.add(new Termin(LocalDateTime.now().plusWeeks(1), "Essen mit Bruce", "Besprechung..."));
        System.out.println(termine);


    }
}

class Termin implements Comparable<Termin> {

    private LocalDateTime zeitpunkt;

    private String titel;

    private String beschreibung;

    public Termin(LocalDateTime zeitpunkt, String titel, String beschreibung) {
        this.zeitpunkt = zeitpunkt;
        this.titel = titel;
        this.beschreibung = beschreibung;
    }

    public LocalDate getDatum() {
        return zeitpunkt.toLocalDate();
    }

    public LocalTime getUhrzeit() {
        return zeitpunkt.toLocalTime();
    }

    public String getTitel() {
        return titel;
    }

    public String getBeschreibung() {
        return beschreibung;
    }

    @Override
    public int compareTo(Termin other) {
        // TODO: Ggfl noch weitere Vergleiche
        return zeitpunkt.compareTo(other.zeitpunkt);
    }
}
