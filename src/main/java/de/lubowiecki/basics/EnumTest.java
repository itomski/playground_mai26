package de.lubowiecki.basics;

import java.time.Month;

public class EnumTest {

    public static void main(String[] args) {

        // Enums sind Aufzählungen von möglichen Optionen

//        Medium m1 = new Medium("Kochen oh ne Fett", "Peter Parker", "12345678-90", "Buch");
//        Medium m2 = new Medium("Kochen oh ne Fett", "Peter Parker", "12345678-90", "buch");
//        Medium m3 = new Medium("Kochen oh ne Fett", "Peter Parker", "12345678-90", "BUCH");
//        Medium m4 = new Medium("Kochen oh ne Fett", "Peter Parker", "12345678-90", "BOOK");
//        Medium m5 = new Medium("Kochen oh ne Fett", "Peter Parker", "12345678-90", "B");
        Medium m6 = new Medium("Kochen ohne Fett", "Peter Parker", "12345678-90", MedienTyp.BUCH);
        Medium m7 = new Medium("Backen ohne Fett", "Bruce Banner", "12345678-95", MedienTyp.BUCH);

    }
}

enum MedienTyp {

    BUCH, CD, DVD, BLUE_RAY, ZEITSCHRIFT;

}

class Medium {

    private String titel;
    private String autor;
    private String isbn;
    //private String medienTyp;
    private MedienTyp medienTyp;

    //public Medium(String titel, String autor, String isbn, String medienTyp) {
    public Medium(String titel, String autor, String isbn, MedienTyp medienTyp) {
        this.titel = titel;
        this.autor = autor;
        this.isbn = isbn;
        //this.medienTyp = medienTyp.toUpperCase();
        this.medienTyp = medienTyp;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Medium{");
        sb.append("titel='").append(titel).append('\'');
        sb.append(", autor='").append(autor).append('\'');
        sb.append(", isbn='").append(isbn).append('\'');
        sb.append(", medienTyp='").append(medienTyp).append('\'');
        sb.append('}');
        return sb.toString();
    }
}

