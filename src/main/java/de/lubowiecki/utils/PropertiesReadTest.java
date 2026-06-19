package de.lubowiecki.utils;

import java.io.*;
import java.util.Properties;

public class PropertiesReadTest {

    public static void main(String[] args) {

        String pathToUserDir = System.getProperty("user.home");
        File fileProps = new File(pathToUserDir + "/conf/config.properties");
        File fileXml = new File(pathToUserDir + "/conf/config.xml");

        Properties props = new Properties();

//        try(Reader in = new FileReader(fileProps)) {
//            props.load(in);
//        }
//        catch (IOException e) {
//            System.out.println(e.getMessage());
//        }

        try(InputStream in = new FileInputStream(fileXml)) {
            props.loadFromXML(in);
        }
        catch(IOException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(props);
        System.out.println(props.getProperty("db.user"));
        System.out.println(props.getProperty("db.secret", "leer"));





    }
}
