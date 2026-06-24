package de.lubowiecki.basics;

public class InitializerTest {

    public static void main(String[] args) {

//        SubSub s1 = new SubSub();
//        System.out.println();
//        System.out.println();
//        SubSub s2 = new SubSub();

        // static Initializer werden ausgeführt
        System.out.println(SubSub.ZAHL);

        String s = "OCA";
        StringBuilder sb = new StringBuilder("OCA");
        char[] chars = s.toCharArray(); // In String verfügbar
        // chars = sb.toCharArray(); // In StringBuilder verfügbar

        s.indexOf("A");
        s.lastIndexOf("A");
        //s.substring(-1, -1);

        String namen = String.join(", ", "Peter", "Bruce", "Carol");
        System.out.println(namen);

        String[] namenArr = namen.split(", ");
        for(String n : namenArr)
            System.out.println(n);


        // {null, {1,2,3}, {4,5}}

        // 0b0000111
        // 0130
        // 0x2A

        // run(); // StackOverflowError

        try {

        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
        finally {

        }



    }

    static void run() {
        run();
    }
}

class Super {

    static {
        System.out.println("SI: Super");
        i = 100;
        // j = 200; // j ist beim Laden der Klasse noch nicht verfügbar
    }

    {
        System.out.println("I: Super");
    }

    static final int i;

    int j;

    public Super() {
        // super();
        // <--- Initializer
        System.out.println("C: Super");
    }
}

class Sub extends Super {

    static {
        System.out.println("SI: Sub");
    }

    {
        System.out.println("I: Sub");
    }

    public Sub() {
        // super();
        // <--- Initializer
        System.out.println("C: Sub");
    }
}

class SubSub extends Sub {

    public static int ZAHL = 200;

    static {
        System.out.println("SI: SubSub");
    }

    {
        System.out.println("I: SubSub");
    }

    public SubSub() {
        // super();
        // <--- Initializer
        System.out.println("C: SubSub");
    }
}
