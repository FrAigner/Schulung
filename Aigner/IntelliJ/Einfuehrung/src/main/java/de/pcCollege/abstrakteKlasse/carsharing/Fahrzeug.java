package de.pcCollege.abstrakteKlasse.carsharing;

public abstract class Fahrzeug {

    // Instanzenvariable
    protected boolean frei;
    protected String standort;

    // Klassenvariable
    protected static int anzahlFahrzeuge;

    // Kosnstruktor
    public Fahrzeug(boolean frei, String standort) {
        this.frei = frei;
        this.standort = standort;
    }

    // Setter & Getter
    public String getStandort() {
        return standort;
    }

    public void setStandort(String standort) {
        this.standort = standort;
    }

    public static int getAnzahlFahrzeuge() {
        return anzahlFahrzeuge;
    }

    // Abstrakt Methoden
    public abstract int anfragen(String standort);
    public abstract boolean buchenFahrzeug(String standort);
    public abstract void freigeben(String standorts);

}
