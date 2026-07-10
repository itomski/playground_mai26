package de.lubowiecki.test;

public class TestMethoden1 {

    private int zahl = 100;
    private static int staticZahl = 200;

    public static void main(String[] args) {

        class LocalClass {
        }

        LocalClass lc = new LocalClass();

        InnerClass ic = new TestMethoden1().new InnerClass();

        StaticInnerClass sic = new TestMethoden1.StaticInnerClass();

    }

    private class InnerClass {

        void machWas() {
            System.out.println(zahl);
        }
    }

    static private class StaticInnerClass {

        void machWas() {
            System.out.println(staticZahl);
        }
    }
}
