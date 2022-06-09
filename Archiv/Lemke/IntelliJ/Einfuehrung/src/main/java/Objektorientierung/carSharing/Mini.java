package Objektorientierung.carSharing;

public class Mini extends Fahrzeug {

    // Klassenvariablen
    private static int anzahlMini;
    private static int anzahlMiniFrei;


    public Mini(boolean frei, String standort) {
        super(frei, standort);
        anzahlMini ++;


    }

    @Override
    public int abfrage(String standort) {
        return anzahlMini;
    }


    @Override
    public boolean buchen(String standort) {
        if (anzahlMini > 0)
        {
            this.frei = false;
            anzahlMiniFrei--;
            return true;
        }
        return false;
    }

    @Override
    public void freigeben(String standort) {
        anzahlMiniFrei++;
        this.frei = true;
    }
}
