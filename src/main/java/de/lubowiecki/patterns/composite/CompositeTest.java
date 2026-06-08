package de.lubowiecki.patterns.composite;

public class CompositeTest {

    public static void main(String[] args) {


        Rect r1 = new Rect(100, 20);
//        System.out.println(r1);
//        r1.move(20,25);

        Circle c1 = new Circle(35);
//        System.out.println(c1);
//        c1.move(60, 75);

        Rect r2 = new Rect(50, 50);

        Circle c2 = new Circle(200);

        MovableGroup group = new MovableGroup(r1, r2, c1);
        group.add(c2);
        group.add(new Rect(20, 20));

        group.move(10, 15);
        group.move(0, 75);
        group.move(22, 18);

        System.out.println("----------------");

        MovableGroup group2 = new MovableGroup();
        group2.add(new Circle(75));
        group2.add(new Circle(20));
        group2.add(group); // Gruppe wird der neuen Gruppe hinzugefügt
        group2.move(100, 200);

    }
}
