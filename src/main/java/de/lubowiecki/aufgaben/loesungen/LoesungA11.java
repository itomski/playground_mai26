package de.lubowiecki.aufgaben.loesungen;

import java.time.LocalDateTime;

public class LoesungA11 {


    public static void main(String[] args) {

        //Logger logger = new Logger(); // Error: Konstruktor ist privat
        Logger logger = Logger.getInstance();
        logger.log("Text1");
        logger.log("Text2");
        logger.log("Text3");

        System.out.println(logger.print());

        System.out.println("------------------");

        Logger logger2 = Logger.getInstance(); // getInstance gibt IMMER das gleiche Logger-Objekt
        logger2.log("Text4");
        logger2.log("Text5");

        System.out.println(logger2.print());
        System.out.println("-------------------");
        System.out.println(logger.print());

    }
}

class Logger {

    private String content = "";

    private static final Logger instance = new Logger();

    private Logger() {
    }

    public static Logger getInstance() {
        return instance;
    }

    public String print() {
        return content;
    }

    public void log(String content) {
        this.content += LocalDateTime.now() + ": " + content + "\n"; // this.content = this.content + content
    }
}
