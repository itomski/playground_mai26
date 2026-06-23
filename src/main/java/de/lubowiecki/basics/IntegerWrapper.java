package de.lubowiecki.basics;

public class IntegerWrapper {

    public static void main(String[] args) {

        int i = 125;

        System.out.println(Integer.toBinaryString(i));
        System.out.println(Integer.toOctalString(i));
        System.out.println(Integer.toHexString(i));

        i = 012; // 10
        System.out.println(i);
        i = 0xA; // 10
        System.out.println(i);
        i = 0b1010; // 10
        System.out.println(i);

        String s = "012";
        i = Integer.parseInt(s); // Parser geht von Dezimal aus und ignoriert führende 0
        System.out.println(i);

        //i = Integer.parseInt("0b1010"); // NumberFormatException

        s = "1010";
        i = Integer.parseInt(s, 2); // Binär
        System.out.println(i);

        s = "AB12";
        i = Integer.parseInt(s, 16); // Hex
        System.out.println(i);

        // Für decode wird das Prefix angegeben
        System.out.println(Integer.decode("012"));
        System.out.println(Integer.decode("0x12"));
        System.out.println(Integer.decode("0b101")); // decode verarbeitet kein Binärcode

    }
}
