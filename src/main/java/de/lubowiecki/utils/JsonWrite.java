package de.lubowiecki.utils;

import tools.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class JsonWrite {

    public static void main(String[] args) {

        Config conf = new Config();
        conf.setUser("admin");
        conf.setPassword("gehiem#123");
        conf.setHost("localhost");
        conf.setPort("3306");
        conf.setDriver("mysql");

        final String FILE = System.getProperty("user.home") + "/conf/config.json";

        ObjectMapper mapper = new ObjectMapper();

        try(Writer out = new FileWriter(FILE)) {
            mapper.writeValue(out, conf); // Objekt wird als JSON in die Datei geschrieben
        }
        catch(IOException e) {
            e.printStackTrace();
        }
    }
}
