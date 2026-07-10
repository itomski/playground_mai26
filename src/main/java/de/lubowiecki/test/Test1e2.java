package de.lubowiecki.test;

import java.util.*;

public class Test1e2 {

    public static void main(String[] args) {

        Map<String, Integer> myMap = new HashMap<>();
        myMap.put("Peter", 25);
        myMap.put("Bruce", 42);
        myMap.put("Carol", 31);
        myMap.put("Steve", 72);

        for(String name : myMap.keySet()) {
            System.out.println(myMap.get(name));
        }

        List<String> strList = new ArrayList<>();
        Collections.unmodifiableList(strList);


    }
}

interface Ax {
    default void x() {
        System.out.println("x");
    }
}

interface Bx extends Ax {
    void x();
}

class Ay implements Ax {

}