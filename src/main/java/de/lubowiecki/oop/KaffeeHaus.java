package de.lubowiecki.oop;

public class KaffeeHaus {

    public static void main(String[] args) {

        Espresso es1 = new Espresso();
        System.out.println(es1);
        Cappuccino es2 = new Cappuccino();
        System.out.println(es2);

    }
}

abstract class KaffeeProdukt {

    private final int kaffee;
    private final int wasser;
    private final int milch;

    public KaffeeProdukt(int kaffee, int wasser, int milch) {
        this.kaffee = kaffee;
        this.wasser = wasser;
        this.milch = milch;
    }

    public int getKaffee() {
        return kaffee;
    }

    public int getWasser() {
        return wasser;
    }

    public int getMilch() {
        return milch;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder(getClass().getSimpleName());
        sb.append("{kaffee=").append(kaffee);
        sb.append(", wasser=").append(wasser);
        sb.append(", milch=").append(milch);
        sb.append('}');
        return sb.toString();
    }
}

class Espresso extends KaffeeProdukt {

    public Espresso() {
        super(12, 25, 0);
    }
}

class Cappuccino extends KaffeeProdukt {

    public Cappuccino() {
        super(18, 50, 70);
    }
}

class Americano extends KaffeeProdukt {

    public Americano() {
        super(12, 120, 0);
    }
}
