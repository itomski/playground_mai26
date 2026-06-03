package de.lubowiecki.api;

public class FluentTest {

    public static void main(String[] args) {

        NotFluent nf = new NotFluent();
        nf.append("Das ist");
        nf.append(" das Haus..."); // Aufruf der Methode IMMER über die Referenz
        System.out.println(nf);

        Fluent f = new Fluent();
        f.append("Das ist").append(" das Haus...");
        System.out.println(f);

    }
}

class NotFluent {

    String content = "";

    public void append(String str) {
        content += str;
    }

    @Override
    public String toString() {
        return content;
    }
}

class Fluent {

    String content = "";

    public Fluent append(String str) {
        content += str;
        return this; // Eine Referenz auf sich selbst wird zurückgegeben
    }

    @Override
    public String toString() {
        return content;
    }
}