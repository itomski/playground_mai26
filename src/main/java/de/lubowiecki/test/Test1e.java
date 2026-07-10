package de.lubowiecki.test;

public class Test1e {

    public static void main(String[] args) {

        int i = 1, j = 10;
        do {
            if (i++ > --j) continue;
        } while (i < 5);
        System. out.println("i=" + i + " j=" + j);

        System.out.println();

        String s = null;
        System.out.println(s + "a");

        s = "";
        System.out.println(s + "a");


        System.out.println();

        ABCD abcd = new MNOP();
        MNOP mnop = new MNOP();

        System.out.println(abcd.x);
        System.out.println(abcd.getX());
        System.out.println(mnop.x);
        System.out.println(mnop.getX());

    }
}

class ABCD {
    int x = 10;

    public int getX() {
        return x;
    }
}

class MNOP extends ABCD {
    final int x = 20;

//    public int getX() {
//        return x;
//    }
}

