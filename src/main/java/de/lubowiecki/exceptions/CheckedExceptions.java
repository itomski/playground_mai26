package de.lubowiecki.exceptions;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedExceptions {

    public static void main(String[] args) {
        System.out.println("START: Main");
        try {
            methodA();
        } catch (IOException e) {
            System.out.println("Problem");
        }
        System.out.println("ENDE: Main");
    }

    public static void methodA() throws IOException {
        System.out.println("START: A");
        methodB();
        System.out.println("ENDE: A");
    }

    public static void methodB() throws IOException {
        System.out.println("START: B");
        methodC();
        System.out.println("ENDE: B");
    }

    /**
     * Versucht alle Zeilen einer Datei zu lesen
     * @throws IOException
     */
    public static void methodC() throws IOException {
        System.out.println("START: C");
//        try {
            List<String> zeilen = Files.readAllLines(Paths.get("data_.txt"));
//        }
//        catch(Exception e) {
//            System.out.println("Problem beim Zugriff auf die Datei.");
//        }
        System.out.println("ENDE: C");
    }
}