package de.lubowiecki.oop;

public class AnonymeKlassen {

    transient Integer i = 100;

    public static void main(String[] args) {

        //Test t1 = new Test();

        // Anonyme Klasse (Klasse ohne Namen) die von Test abgeleitet ist
        // und alle abstrakten Methoden realisiert wird sofort instanziert
        Test t2 = new Test() {
            @Override
            public void machWasAnderes() {
                System.out.println("MachWasAnderes");
            }
        };

        t2.machWas();
        t2.machWasAnderes();

        Test2 t3 = new Test2(){};

        Number[] arr = new Integer[5];
        // Double[] arr = new Integer[5];

        System.out.println();

        System.out.println(Integer.SIZE);
        System.out.println(Integer.BYTES);
        System.out.println(Integer.MIN_VALUE);
        System.out.println(Integer.MAX_VALUE);

        System.out.println();

        char c = 'C';
        c++; // c = (char)(67 + 1);
        //c = (char)(c + 1);
        System.out.println(c);

        byte b = 1;
        b = (byte)(b + 1); // mind. int

        StringBuilder sb = new StringBuilder();
        char[] arr2 = {'A','B','C','D','E'};
        //sb.append(arr2,0, 3);
        sb.append(arr2,1, 3);
        System.out.println(sb);

        int i = 10;
        i = i++ + ++i;
        System.out.println(i);


        int j;

        if(i > 2) {
            j = 2;
        }
        else {
            j = 0;
        }

        System.out.println(j);

        // Instanzmethoden werden auf dem Objekttyp ausgeführt
        // statische Methoden und Attribute werden auf dem Referenztyp ausgeführt

        //short s = 38_000;
    }
}

abstract class Test {

    public void machWas() {
        System.out.println("MachWas");
    }

    public abstract void machWasAnderes();
}

abstract class Test2 {

    public void machWas() {
        System.out.println("MachWas");
    }
}
