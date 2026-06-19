package de.lubowiecki.utils;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class LocaleTest {

    public static void main(String[] args) {

        //System.out.println(Locale.getDefault());
        Locale.setDefault(Locale.US);

        System.out.printf("Der Preis ist %.2f \n", 10.99);

        DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);
        LocalDate ld = LocalDate.now();
        System.out.println(ld.format(FMT));
    }
}
