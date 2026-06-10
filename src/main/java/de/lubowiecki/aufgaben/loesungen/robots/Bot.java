package de.lubowiecki.aufgaben.loesungen.robots;

public class Bot {

    private int x;
    private int y;
    private char id = '@';

    // Richtung, in die der Bot gerade gedreht ist
    private Direction direction = Direction.EAST;

    public Bot() {
        this.x = 0;
        this.y = 0;
    }

    public Bot(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public Bot(int x, int y, char id) {
        this(x, y);
        this.id = id;
    }

    public boolean move(String step) {

        switch(step) {
            case "L" -> {
                direction = Compass.left(direction);
                return true;
            }
            case "R" -> {
                direction = Compass.right(direction);
                return true;
            }
            case ">" -> {
                forward();
                return true;
            }
            case "<" -> {
                backward();
                return true;
            }
            default -> {
                return false;
            }
        }
    }

    public void forward() {
        // TODO: Bewegung nicht ausführen, wenn nicht möglich!
        // TODO: gemeinsame Methode finden
        switch(direction) {
            case EAST -> y++;
            case SOUTH -> x++;
            case WEST -> y--;
            case NORTH -> x--;
        }
    }

    public void backward() {
        // TODO: Bewegung nicht ausführen, wenn nicht möglich!
        // TODO: gemeinsame Methode finden
        switch(direction) {
            case EAST -> y--;
            case SOUTH -> x--;
            case WEST -> y++;
            case NORTH -> x++;
        }
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    @Override
    public String toString() {
        return id + "";
    }
}
