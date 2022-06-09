package de.pcCollege.Vorlage;

import de.pcCollege.objektorientierung.Richtung;

public class Fahrzeug {
    private int geschwindigkeit;
    private int tempolimit;

    public Richtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Richtung richtung) {
        this.richtung = richtung;
    }

    private Richtung richtung;

    public Fahrzeug() {
        this.tempolimit = 130;
    }

    public Fahrzeug(int tempolimit) {
        this.tempolimit = tempolimit;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        if (geschwindigkeit > tempolimit) {
            this.geschwindigkeit = tempolimit;
        } else {
            this.geschwindigkeit = geschwindigkeit;
        }
    }

    public int getTempolimit() {
        return tempolimit;
    }

    public void setTempolimit(int tempolimit) {
        this.tempolimit = tempolimit;
    }

    @Override
    public String toString() {
        return "Fahrzeug{" +
                "geschwindigkeit=" + geschwindigkeit +
                ", tempolimit=" + tempolimit +
                ", richtung=" + richtung +
                '}';
    }
}
