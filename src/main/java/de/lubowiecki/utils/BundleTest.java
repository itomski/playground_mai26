package de.lubowiecki.utils;

import java.util.Locale;
import java.util.ResourceBundle;
import java.util.Scanner;

public class BundleTest {

    public static void main(String[] args) {

        final Scanner scanner = new Scanner(System.in);

        Locale.setDefault(Locale.ENGLISH);

        final ResourceBundle bundle = ResourceBundle.getBundle("lang.messages");

        System.out.println(bundle.getString("welcome"));
        System.out.println(bundle.getString("question.name"));
        String name = scanner.next();
        System.out.println(bundle.getString("question.age"));
        int age = scanner.nextInt();
        System.out.println(bundle.getString("greeting") + " " + name);
    }
}
