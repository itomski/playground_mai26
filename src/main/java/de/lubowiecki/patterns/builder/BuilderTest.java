package de.lubowiecki.patterns.builder;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.util.Locale;

public class BuilderTest {

    public static void main(String[] args) {


        Locale loc = Locale.getDefault();
        System.out.println(loc);

        System.out.println(Locale.US);
        System.out.println(Locale.CANADA);

        Locale.Builder locBuilder = new Locale.Builder();
        Locale loc2 = locBuilder.setLanguage("zh").setRegion("ZH").build();
        System.out.println(loc2);

        Locale.setDefault(loc2);

        System.out.printf("%.2f \n", 10.25);
        LocalDate ld = LocalDate.now();
        final DateTimeFormatter FMT = DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG);
        System.out.println(ld.format(FMT));
    }
}
