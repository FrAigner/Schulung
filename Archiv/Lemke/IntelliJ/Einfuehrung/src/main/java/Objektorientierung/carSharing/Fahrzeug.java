package Objektorientierung.carSharing;

public abstract class Fahrzeug {
    //Variablen
    protected boolean frei;
    protected String standort;
    // Klassenvariable
    protected static int anzahlFahrzeug;

    //Konstruktor
    public Fahrzeug(boolean frei, String standort) {
        this.frei = frei;
        this.standort = standort;
    }

    //setter & Getter
    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public static int getAnzahlFahrzeug() {
        return anzahlFahrzeug;
    }

    //abstrakte Methode
    public abstract int abfrage(String standort);
    public abstract boolean buchen(String standort);
    public abstract void freigeben(String standort);

}
