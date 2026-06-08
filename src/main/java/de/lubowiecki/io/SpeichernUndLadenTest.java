package de.lubowiecki.io;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SpeichernUndLadenTest {

    private static final Scanner scanner = new Scanner(System.in);
    private static final String FILE = "data.ser";

    public static void main(String[] args) {

        List<String> liste = readFromFile();

        for (int i = 0; i < 3; i++) {
            System.out.print("Produkt: ");
            liste.add(scanner.nextLine());
            writeToFile(liste); // Nach jedem Produkt wird die Liste in eine Datei gespeichert
        }

        System.out.println("---------------");

        for(String produkt : liste) {
            System.out.println(produkt);
        }
    }

    private static void writeToFile(List<String> liste) {
        // Serialisierte Daten werden als Byte-Werte gespeichert
        // ObjectOutputStream schreibt Objekte in eine Datei
        try(ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(FILE))) {
            out.writeObject(liste); // Liste serialisieren und spiechern
        }
        catch (IOException e) {
            e.printStackTrace(); // Ausgabe
        }
    }

    private static List<String> readFromFile() {
        List<String> liste;
        try(ObjectInputStream in = new ObjectInputStream(new FileInputStream(FILE))) {
            // readObject liefert immer ein Object und muss ggfl gecastet werden
            liste = (ArrayList<String>) in.readObject(); // Altdaten einlesen...
        }
        catch(Exception e) {
            liste = new ArrayList<>(); // ...oder eine leere Liste bereitstellen
            e.printStackTrace();
        }
        return liste;
    }
}
