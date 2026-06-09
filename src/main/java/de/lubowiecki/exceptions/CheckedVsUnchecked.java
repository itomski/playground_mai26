package de.lubowiecki.exceptions;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;

public class CheckedVsUnchecked {

    public static void main(String[] args) {

        int[] arr = new int[5];
        // Kann behandelt werden - MUSS aber nicht
        System.out.println(arr[5]); // ArrayIndenOutOfBoundsException - unchecked

        // NIO
        // Liest alle Zeilen einer Datei als List ein
        // readAllLines kann eine IOException produzieren - checked
        // List<String> zeilen = Files.readAllLines(Paths.get("data.txt"));

    }
}
