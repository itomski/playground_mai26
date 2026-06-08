package de.lubowiecki.patterns.composite;

// abstract verhindert eine direkte Instanzierung von GeoForm
public abstract class GeoForm implements Movable {

    private int x;
    private int y;

    public void move(int x, int y) {
        this.x = x;
        this.y = y;
        System.out.println(this);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
}
