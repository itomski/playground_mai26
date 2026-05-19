package de.lubowiecki.oop;

import java.util.Random;

public class DiceCup {

    private static Random randGenerator = new Random();

    public static int roll() {
        return randGenerator.nextInt(1, 7);
    }
}
