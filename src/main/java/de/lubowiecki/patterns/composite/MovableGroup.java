package de.lubowiecki.patterns.composite;

import java.util.ArrayList;
import java.util.List;

public class MovableGroup implements Movable {

    private List<Movable> elements = new ArrayList<>();

    public MovableGroup() {
    }

    public MovableGroup(Movable... obj) {
        add(obj);
    }

    // Fügt ein einziges Element zu der Liste hinzu
    public void add(Movable obj) {
        elements.add(obj);
    }

    // Fügt ein mehrere Element zu der Liste hinzu
    public void add(Movable... obj) {
        elements.addAll(List.of(obj));
    }


    @Override
    public void move(int x, int y) {
        for(Movable m : elements) {
            m.move(x, y); // Gruppe delegiert den Aufruf an die einzelnen Elemente
        }
    }
}
