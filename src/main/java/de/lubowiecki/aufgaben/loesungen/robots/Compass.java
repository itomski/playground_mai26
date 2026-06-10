package de.lubowiecki.aufgaben.loesungen.robots;

public class Compass {

    private Compass() {
    }

    public static Direction left(Direction cur) {
        return switch(cur) {
            case EAST -> Direction.NORTH;
            case SOUTH -> Direction.EAST;
            case WEST -> Direction.SOUTH;
            case NORTH -> Direction.WEST;
        };
    }

    public static Direction right(Direction cur) {
        return switch(cur) {
            case EAST -> Direction.SOUTH;
            case SOUTH -> Direction.WEST;
            case WEST -> Direction.NORTH;
            case NORTH -> Direction.EAST;
        };
    }
}
