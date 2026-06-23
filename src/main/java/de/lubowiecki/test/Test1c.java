package de.lubowiecki.test;

public class Test1c {

    public static void main(String[] args) {

        B b = new B();


        int[][] arr = new int[3][3];
        /*
        {
            0: {0,0,0},
            1: {0,0,0},
            2: {0,0,0}
        }
        */

        arr[0] = new int[2];
        /*
        {
            0: {0,0},
            1: {0,0,0},
            2: {0,0,0}
        }
        */

        int[][] arr2 = new int[2][]; // {null, null}
        int[][] arr3 = new int[2][2]; // {{0,0},{0,0}}
        int[][] arr4 = new int[2][0]; // {{},{}}

        System.out.println(machWas());


        //Integer i = (Integer)new String(); // Error
        Integer i = (Integer)new Object(); // Ok: ClassCastException
        Object o = new Integer(10); // Ok

        boolean b2 = false;

        if(b2 = true) {
            // OK
        }

        int arr5[] = {1,2,3};
        arr5 = new int[5]; // arr5 ist nicht final - Referenz darf versetzt werden

        final int arr6[] = {1,2,3};
        //arr6 = new int[5]; // Error: Referenz darf nicht versetzt werden
        arr6[0] = 10;

        if(arr6[0] == 10);
            System.out.println("A");
//        else
//            System.out.println("B");


        String eingabe = "exit";

        // Switch: byte, short, int, String, Enums, char

        switch(eingabe.trim().toUpperCase()) {

//            case "Neu", "neu", "NEU":
//                System.out.println("Neues Objekt");
//
//            case "exit", "Exit", "EXIT":
//                System.out.println("EXIT");

            case "NEU":
                System.out.println("Neues Objekt");

            case "EXIT":
                System.out.println("EXIT");
        }


    }

    static int machWas() {

        try {
            //return 10;
            throw new NullPointerException("...");
        }
        finally {
            return 20; // Überschriebt das return oder Exception im try
        }
    }

}

class A {

    {
        System.out.println("I: A");
        int j = 100;
    }

    public A() {
        // super();
        // Initializer...
        System.out.println("C: A");
    }
}

class B extends A {

    {
        System.out.println("I: B");
    }

    public B() {
        // super();
        // Initializer...
        System.out.println("C: B");
    }
}
