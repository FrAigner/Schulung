package de.pcCollege.objektOrientierung.carsharing;

public class Mini extends Fahrzeug{

    // Klassenvariable
    private static int anzahlMini;
    private static int anzahlMiniFrei;
    // Konstruktor

    public Mini(boolean frei, String standort) {
        super(frei, standort);
        anzahlMini++;
        if(frei)
        {
            anzahlMiniFrei++;
        }
    }

    @Override
    public int anfragen(String standort) {
        return anzahlMiniFrei;
    }


    @Override
    public boolean buchen(String standort) {
        if(anzahlMiniFrei > 0)
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
