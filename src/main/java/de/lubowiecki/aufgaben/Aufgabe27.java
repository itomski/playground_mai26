package de.lubowiecki.aufgaben;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.ArrayList;
import java.util.List;

public class Aufgabe27 {

    public static void main(String[] args) {

        /*
        Schreibe ein Programm für eine 7-Tage-Übersicht.
        Startet beim aktuellen Datum.
        Die Übersicht kann je um eine Woche vorwärts oder rückwärts bewegt werden.

        Erweiterung 1:
        Das Datumformat soll landesüblich sein.

        Erweiterung 2:
        Nach Eingabe eines Datum wird ab dem Datum die 7-Tage-Übersicht angezeigt.
         */

        Summary summary = new Summary();
        summary.print();
        System.out.println();

        summary.forward().print();
        System.out.println();

        summary.backward().backward().print();
        System.out.println();

        summary.set(LocalDate.of(2015, 10, 17)).print();
    }
}

class Summary {

    private static final DateTimeFormatter DATE_FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM);

    private LocalDate start;

    public Summary() {
        start = LocalDate.now();
    }

    public Summary(LocalDate start) {
        this.start = start;
    }

    public Summary forward() {
        start = start.plusWeeks(1);
        return this;
    }

    public Summary backward() {
        start = start.minusWeeks(1);
        return this;
    }

    public Summary set(LocalDate start) {
        this.start = start;
        return this;
    }

    public void print() {
        for(LocalDate cur : createSummeryList()) {
            System.out.print(cur.format(DATE_FMT) + ", ");
        }
    }

    private List<LocalDate> createSummeryList() {
        List<LocalDate> list = new ArrayList<>();
        LocalDate cur = start;

        for (int i = 0; i < 7; i++) {
            list.add(cur);
            cur = cur.plusDays(1);
        }

        return list;
    }
}
