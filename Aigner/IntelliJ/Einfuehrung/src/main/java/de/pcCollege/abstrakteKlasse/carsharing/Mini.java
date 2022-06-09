package de.pcCollege.abstrakteKlasse.carsharing;

public class Mini extends Fahrzeug {
    // Klassenvariable
    private static int anzahlMini;
    private static int anzahlMiniFrei;

    // Konstruktor
    public Mini(boolean frei, String standort) {
        super(frei, standort);
        anzahlMini++;
        if (frei) {
            anzahlMini++;
        }
    }

    @Override
    public int anfragen(String standort) {
        return 0;
    }


    @Override
    public boolean buchenFahrzeug(String standort) {
        if (anzahlMiniFrei > 0) {
            this.frei = false;
            anzahlMiniFrei--;
            return true;
        }
        return false;
    }

    @Override
    public void freigeben(String standorts) {
        anzahlMiniFrei++;
        this.frei = true;
    }
}