package de.lubowiecki.test;

public class Test1b {

    public static void main(String[] args) {

        var i = 0;

        // short-circuit
        // &&: rechte Bedingung wird nur ausgeführt, wenn die linke true ergibt
        // ||: rechte Bedingung wird nur ausgeführt, wenn die linke false ergibt

        if(false && i++ > 10) {
            System.out.println(i);
        }
        else if(false && i++ > 20) {
            System.out.println(i);
        }
        else if(false && i++ > 30) {
            System.out.println(i);
        }

        System.out.println(i);


        for (int j = 0; j < 10; System.out.println(j++));

        float f1 = 1f;
        f1 = .5f;

        double d = 10.0/0.0;
        System.out.println(d);

        int j = 10/0; // ArithmeticException
        System.out.println(j);

        long l1 = 100; // Primitive Widening von int auf long
        //Long l2  = 100; // Autoboxing int zu Integer dann komplex Widening von Integer auf Long (nicht möglich)
        Long l3  = 100L; // Autoboxing long zu Long

    }
}
