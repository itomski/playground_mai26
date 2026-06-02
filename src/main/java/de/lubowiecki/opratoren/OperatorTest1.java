package de.lubowiecki.opratoren;

public class OperatorTest1 {

    public static void main(String[] args) {

        // Unary
        byte by = -1;
        by = +10;
        //System.out.println(!by); // Error: ! nur bei boolean erlaubt

        boolean ok = true;
        System.out.println(!ok); // dreht den wert um

        System.out.println(by++);
        System.out.println(by--);
        System.out.println(++by);
        System.out.println(--by);

        System.out.println(~by);
        System.out.println();

        // Andere
        System.out.println(1 + 2f * -2);
        System.out.println((1d + 2) * 2);

        System.out.println(11 % 2);
        System.out.println(11 % -2);
        System.out.println(-11 % 2);
        System.out.println(-11 % -2);
        System.out.println(2 % 10);
        System.out.println();

        // Logisch
        int a = 10;
        int b = 2;
        //System.out.println(a && b); // Error: Logisch nur mit boolean möglich


        // Bit-Wise

        // a: 00001010
        // b: 00000010
        //    00000010
        System.out.println(a & b); // AND: Bit-Wise

        // a: 00001010
        // b: 00000010
        //    00001010
        System.out.println(a | b); // OR: Bit-Wise

        // a: 00001010
        // b: 00000010
        //    00001000
        System.out.println(a ^ b); // XOR: Bit-Wise

        // a: 00001010
        //    00000101
        System.out.println(a >> 1); // Schift: Bit-Wise

        // a: 00001010
        //    00010100
        System.out.println(a << 1); // Schift: Bit-Wise


    }
}
