package de.pcCollege.objektOrientierung.carsharing;

public abstract class Fahrzeug {
    // Instanzenvariable
    protected boolean frei;
    protected String standort;
    // Klassenvariable
    protected static int anzahlFahrzeuge;
    // Konstruktor
    public Fahrzeug(boolean frei, String standort) {
        this.frei = frei;
        this.standort = standort;
        anzahlFahrzeuge++;
    }
    // Setter und Getter

    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public static int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }

    // Abstrakte Methode
    public abstract int anfragen(String standort);
    public abstract boolean buchen(String standort);
    public abstract void freigeben(String standort);
}
