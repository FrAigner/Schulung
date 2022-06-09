package Objektorientierung.Vorlagen;

public class Fahrzeug {

    private int geschwindigkeit;
    private int limiter = 200;
    private boolean motoran;

    private Richtung richtung;

    public Fahrzeug() {
    }

    public Fahrzeug(int limiter) {
        this.limiter = limiter;
    }

    public Richtung getRichtung() {
        return richtung;
    }

    public void setRichtung(Richtung richtung) {
        this.richtung = richtung;
    }

    public int getGeschwindigkeit() {
        return geschwindigkeit;
    }

    public void setGeschwindigkeit(int geschwindigkeit) {
        if(geschwindigkeit>limiter)
        {
            this.geschwindigkeit = limiter;
        }
        else {
        this.geschwindigkeit = geschwindigkeit;
        }
    }

    public boolean isMotoran() {
        return motoran;
    }

    public void setMotoran(boolean motoran) {
        this.motoran = motoran;
    }

    @Override
    public String toString() {
        return "Fahrzeug:" +
                "Geschwindigkeit=" + geschwindigkeit +
                ", Limiter=" + limiter +
                ", Richtung=" + richtung +
                '.';
    }
}
