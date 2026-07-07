package de.lubowiecki.test;

public class TestVererbung {


}

class V1 {

    public V1(int i) {
    }
}

class V2 extends V1 {

//    public V2() {
//        super();
//    }


    public V2() {
        // Wird mit this ein anderer Konstruktor verwendet, wird super nicht aufgerufen
        this(200);
    }

    public V2(int j) {
        super(j);
    }
}
