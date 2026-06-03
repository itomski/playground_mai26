package de.lubowiecki.io;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class TextLesen {

    public static void main(String[] args) {

        // IO
        try(BufferedReader in = new BufferedReader(new FileReader("data.txt"))) {

            String line;
            while((line = in.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println();

        // NIO
        Path pfad = Paths.get("data.txt");

        try {
            Files.readAllLines(pfad)
                    .forEach(System.out::println);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }
}
