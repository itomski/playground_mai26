package de.lubowiecki.collections;

import java.util.*;

public class Warteschlangen {

    public static void main(String[] args) {

        // Warteschlange
        // FIFO = First-In-First-Out
        Queue<String> jobs = new LinkedList<>();

        jobs.offer("Auswertung erstellen");
        jobs.offer("Besprechung");
        jobs.offer("Interface Implementieren");
        jobs.offer("Sonstiges");

        System.out.println(jobs);

        while(!jobs.isEmpty()) {
            System.out.println(jobs.poll()); // Nächstes Element entnehemn
        }

        System.out.println(jobs);

        System.out.println();

        // LIFO = Last-In-First-Out
        Deque<String> stack = new ArrayDeque<>();
        stack.push("Job 1"); // Legt ein Element auf den Stack
        stack.push("Job 2");
        stack.push("Job 3");

        System.out.println(stack);

        while(!stack.isEmpty())
            System.out.println(stack.pop()); // Element an der Spitze des Stacks wird entnommen

        System.out.println(stack);


    }
}
