package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;

public class TimeTest {

    public static void main(String[] args) {


        LocalDate ld = LocalDate.now(); // Aktuelles Datum
        ld = LocalDate.of(2020, 10, 15);
        ld = LocalDate.of(2020, Month.OCTOBER, 15);
        //ld = LocalDate.of(2020, 18, 15); // Exception: DateTimeException

        System.out.println(ld); // Ausgabe in ISO
        ld = ld.plusWeeks(2);
        System.out.println(ld);
        ld = ld.plus(10, ChronoUnit.DAYS); // Einheit MUSS von der Datumsklasse supported werden
        //ld = ld.plus(10, ChronoUnit.NANOS); // Exception: UnsupportedTemporalTypeException

        System.out.println(ld.getMonth());
        System.out.println(ld.getMonthValue());

        System.out.println(ld.getDayOfMonth()); // Tag des Monats (Enum Month)
        System.out.println(ld.getDayOfYear()); // Tag des Jahres
        System.out.println(ld.getDayOfWeek()); // Tag der Woche (Enum DayOfWeek)
        System.out.println(ld.get(ChronoField.DAY_OF_WEEK));
        //System.out.println(ld.get(ChronoField.MINUTE_OF_DAY)); // Exception: UnsupportedTemporalTypeException
        System.out.println(ld.getLong(ChronoField.DAY_OF_MONTH));

        System.out.println(ld.isBefore(LocalDate.now())); // Liegt vor dem heutigen Datum
        System.out.println(ld.isAfter(LocalDate.now())); // Liegt nach dem heutigen Datum

        LocalDateTime ldt1 = ld.atTime(LocalTime.now()); // Verbindet Datum mit einer Uhrzeit

        System.out.println(ld);
        ld = ld.with(ChronoField.DAY_OF_MONTH, 15); // Überscheibt eine bestimmte Information
        System.out.println(ld);

        System.out.println(ld.until(LocalDate.now())); // Period = Abstand

        System.out.println("-------");

        LocalTime lt = LocalTime.now(); // Auktuelle Zeit
        lt = LocalTime.of(15, 22);
        //lt = LocalTime.of(27, 22); // Exception: DateTimeException
        System.out.println(lt);
        lt = lt.minusHours(3);
        System.out.println(lt);

        LocalDateTime ldt2 = lt.atDate(LocalDate.now()); // Verbindet Zeit mit einem Datum

        System.out.println("-------");

        LocalDateTime ldt = LocalDateTime.now(); // Beides
        System.out.println(ldt);

        System.out.println("-------");

        System.out.println(ldt.toLocalDate());
        System.out.println(ldt.toLocalTime());

    }
}
