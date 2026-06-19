package de.lubowiecki.utils;

import tools.jackson.databind.ObjectMapper;

import java.io.File;

public class JsonRead {

    public static void main(String[] args) {

        final String FILE = System.getProperty("user.home") + "/conf/config.json";
        File file = new File(FILE);

        ObjectMapper mapper = new ObjectMapper();

        try {
            Config conf = mapper.readValue(file, Config.class);

//            System.out.println(conf.getUser());
//            System.out.println(conf.getPassword());
//            System.out.println(conf.getHost());

            System.out.println(conf);

        }
        catch(Exception e) {
            e.printStackTrace();
        }
    }

}
