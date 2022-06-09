package de.pcCollege.objektOrientierung.vorlagen;

import de.pcCollege.objektOrientierung.Richtung;

public class Fahrzeug {
    private int geschwindigkeit;
    private Richtung richtung;
    private int limit;

    public Fahrzeug(int limit) {
        this.limit = limit;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        this.geschwindigkeit = geschwindigkeit;
    }

    public Richtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Richtung richtung) {
        this.richtung = richtung;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", richtung=" + richtung +
                ", limit=" + limit +
                '}';
    }
}
