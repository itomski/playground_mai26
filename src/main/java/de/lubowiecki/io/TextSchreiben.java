package de.lubowiecki.io;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class TextSchreiben {

    public static void main(String[] args) {

        // IO
        try(Writer out = new FileWriter("data.txt", true)) {
            out.append("Das ist das Haus von Nikigraus!\n");
            // out.close(); // bei try-with-resources wird close automatisch aufgerufen
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
