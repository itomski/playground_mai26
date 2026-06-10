package de.lubowiecki.aufgaben.loesungen.robots;

public class Board {

    // Instanzkonstante - Muss spätestens im Konstruktor zugewiesen werden
    private final Object[][] FIELDS;

    public Board(int size) {
        this.FIELDS = new Object[size][size];
    }

    public Board(int length, int width) {
        this.FIELDS = new Object[length][width];
    }

    public void print() {
        for(Object[] rows : FIELDS) {
            for(Object col : rows) {
                if(col == null) System.out.print(" [ ]");
                else System.out.print(" [" + col + "]");
            }
            System.out.println();
        }
    }

    public boolean set(Bot bot) {
        try {
            FIELDS[bot.getX()][bot.getY()] = bot;
            return true;
        }
        catch(ArrayIndexOutOfBoundsException e) {
            return false;
        }
    }
}
