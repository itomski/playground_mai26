package de.lubowiecki.patterns.singleton;

import java.util.Arrays;

public class SingletonTest {

    public static void main(String[] args) {

        //EagerSingleton es1 = new EagerSingleton(); // Nicht möglich. Konstruktor ist privat
        EagerSingleton es1 = EagerSingleton.getInstance();
        EagerSingleton es2 = EagerSingleton.getInstance();
        EagerSingleton es3 = EagerSingleton.getInstance();

        es1.addContent("Das ist das");
        machWas();
        es2.addContent(" von");
        es3.addContent(" Nikigraus!");
        EagerSingleton.getInstance().addContent("...");

        System.out.println(es1.getContent());
        System.out.println(EagerSingleton.getInstance().getContent());


        // Utility-Klassen (Hilfs-Klassen) haben nur statische Methoden
        // Instanzierung wird durch einen privaten Konstruktor verhindert
        // Bekannte Utility-Klassen:
        // Arrays
        // Collections
        // Objects
        // Math

    }

    static void machWas() {
        EagerSingleton.getInstance().addContent(" Haus");
    }

}

class EagerSingleton {

    private String content = "";

    private static final EagerSingleton instance = new EagerSingleton();

    private EagerSingleton() {
    }

    public static EagerSingleton getInstance() {
        return instance;
    }

    public void addContent(String text) {
        content += text;
    }

    public String getContent() {
        return content;
    }
}
