package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.MonthDay;
import java.time.Year;
import java.time.YearMonth;

public class Specials {

    public static void main(String[] args) {

        Year y = Year.now();
        System.out.println(y);
        YearMonth ym = y.atMonth(2); // Verbindet Jahr mit einem Monat
        System.out.println(ym);
        LocalDate ld = ym.atDay(26); // Verbindet YearMonth mit einem Monatstag
        System.out.println(ld);

        MonthDay md = MonthDay.of(10, 15); // Verbindung aus Monat und Jahr
        System.out.println(md);
        ld = md.atYear(2000); // Kann mit einem Jahr zu einem LocalDate verbunden werden
        System.out.println(ld);
    }
}
