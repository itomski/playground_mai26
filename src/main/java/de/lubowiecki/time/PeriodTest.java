package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest {

    public static void main(String[] args) {

        LocalDate ld = LocalDate.now();
        Period tage30 = Period.ofDays(30); // 30 Tage
        Period monat1 = Period.ofMonths(1); // 1 Monat
        Period spezial = Period.of(1, 32, 64); // 1 Jahr, 32 Monate und 64 Tage - Keine automatische Umrechnung
        System.out.println(tage30);
        System.out.println(spezial);
        System.out.println(spezial.normalized()); // Umrechnung der Einheiten: Tage werden nicht in Monate umgerechnet

        ld = ld.plus(tage30); // Rechnet 30 Tage auf das Datum drauf
        System.out.println(ld);

        Period abstand = Period.between(LocalDate.of(2021,10, 22), LocalDate.now());
        System.out.println(abstand);

        System.out.println(abstand.getDays());
        System.out.println(abstand.getMonths());
        System.out.println(abstand.getYears());
        System.out.println(abstand.toTotalMonths());

    }
}
