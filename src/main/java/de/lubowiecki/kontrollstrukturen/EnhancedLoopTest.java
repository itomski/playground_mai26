package de.lubowiecki.kontrollstrukturen;

public class EnhancedLoopTest {

    public static void main(String[] args) {

        // [] = Array
        char[] zeichen = {'A', 'X', 'Y', 'Z', '!'};
        for(char c : zeichen) {
            System.out.print(c + ", "); // + bei Strings führt zur Verkettung
        }
    }
}
