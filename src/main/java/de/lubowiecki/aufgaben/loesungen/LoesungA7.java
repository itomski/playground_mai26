package de.lubowiecki.aufgaben.loesungen;

public class LoesungA7 {

    public static void main(String[] args) {

        int volumen = QuaderUtils.berechneVolumen(10, 15, 22);
        System.out.println(volumen);

        Quader q1 = new Quader(10, 15, 22);
        System.out.println(q1);

        volumen = QuaderUtils.berechneVolumen(q1);
        System.out.println(volumen);

    }
}

 class QuaderUtils {

    private QuaderUtils() {
    }

    public static int berechneVolumen(int laenge, int breite, int tiefe) {
        return laenge * breite * tiefe;
    }

     public static int berechneVolumen(Quader quader) {
         //return quader.getLaenge() * quader.getBreite() * quader.getTiefe();

         // ANdere Methode wird verwendet
         return berechneVolumen(quader.getLaenge(), quader.getBreite(), quader.getTiefe());
     }
 }

 class Quader {

    private final int laenge;
    private final int breite;
    private final int tiefe;

     public Quader(int laenge, int breite, int tiefe) {
         this.laenge = laenge;
         this.breite = breite;
         this.tiefe = tiefe;
     }

     public int getLaenge() {
         return laenge;
     }

     public int getBreite() {
         return breite;
     }

     public int getTiefe() {
         return tiefe;
     }

     @Override
     public String toString() {
         return "Quader{" +
                 "laenge=" + laenge +
                 ", breite=" + breite +
                 ", tiefe=" + tiefe +
                 '}';
     }
 }
