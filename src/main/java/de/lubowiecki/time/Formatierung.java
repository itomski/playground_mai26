package de.lubowiecki.time;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class Formatierung {

    public static void main(String[] args) {

        DateTimeFormatter FMT1 = DateTimeFormatter.ofPattern("uuuu");
        //DateTimeFormatter FMT2 = DateTimeFormatter.ofPattern("dd.mm.yy"); // Exception: m = Minute der Stude
        DateTimeFormatter FMT2 = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        //FMT2 = DateTimeFormatter.ofPattern("DD.MM.yy"); // D = Tag des Jahres

        // Relevant für die Prüfung: u, y, d, M, D, H, m, s

        LocalDate ld = LocalDate.now();

        System.out.println(FMT2.format(ld));
        System.out.println(ld.format(FMT2));
        System.out.println(ld.format(FMT2));

        //ld = FMT2.parse("25.07.2025");
        // pars verarbeitet per default nur ISO-Format
        //ld = LocalDate.parse("25.07.2025"); // Exception: Liefert ein LocalDate
        ld = LocalDate.parse("25.07.2025", FMT2); // OK
        System.out.println(ld);

        LocalTime lt = LocalTime.parse("13:22"); // Liefert ein LocalTime
        System.out.println(lt);

        // Locale.setDefault(Locale.CANADA); // Lkalisation umstellen

        // Style kann vorgegeben werden
        DateTimeFormatter FMT3 = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL); // Lokalisiertes Datum
        System.out.println(ld.format(FMT3));
    }
}
