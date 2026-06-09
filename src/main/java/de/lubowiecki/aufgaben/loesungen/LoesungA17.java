package de.lubowiecki.aufgaben.loesungen;

public class LoesungA17 {

    public static void main(String[] args) {
        PrintServer server = new PrintServer();
        server.print(new ExcelDoc());
        server.print(new WordDoc());
    }
}

class PrintServer {

    public void print(Printable doc) {
        System.out.println("------- PRINT JOB: START ------");
        doc.print();
        System.out.println("------- PRINT JOB: ENDE ------\n");
    }
}

interface Printable {

    void print();

}

class WordDoc implements Printable {

    @Override
    public void print() {
        System.out.println("Print WordDoc");
    }
}

class ExcelDoc implements Printable {

    @Override
    public void print() {
        System.out.println("Print ExcelDoc");
    }
}