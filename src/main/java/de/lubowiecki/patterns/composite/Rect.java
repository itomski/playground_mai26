package de.lubowiecki.patterns.composite;

public class Rect extends GeoForm {

    private int length;
    private int width;

    public Rect(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public Rect(int x, int y, int length, int width) {
        setX(x);
        setY(y);
        this.length = length;
        this.width = width;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Rect{");
        sb.append("x=").append(getX());
        sb.append(", y=").append(getY());
        sb.append(", length=").append(length);
        sb.append(", width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
