package de.lubowiecki.utils;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Properties;

public class PropertiesWriteTest {

    public static void main(String[] args) {

        String pathToUserDir = System.getProperty("user.home");

        // IO
        File dir = new File(pathToUserDir + "/conf");
        if(!dir.exists()) // Wenn der Ordner conf nicht im Benutzerordner vorhanden ist
            dir.mkdir(); // ... dann erzeugen


        // NIO
//        Path dirPath = Paths.get(pathToUserDir + "/conf");
//        try {
//            if (!Files.exists(dirPath))
//                Files.createDirectory(dirPath);
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        Properties props = new Properties();
        props.setProperty("db.driver", "mysql");
        props.setProperty("db.url", "localhost");
        props.setProperty("db.port", "3306");
        props.setProperty("db.user", "admin");
        props.setProperty("db.password", "geheim#123");
        System.out.println(props);

        File file = new File(dir, "config.properties");
        try(Writer out = new FileWriter(file)) {
            props.store(out, null);
        }
        catch(IOException e) {
            System.out.println("Problem!");
        }

//        File file = new File(dir, "config.xml");
//
//        try(OutputStream out = new FileOutputStream(file)) {
//            props.storeToXML(out, null);
//        }
//        catch(IOException e) {
//            System.out.println("Problem!");
//        }
    }
}
