package Objektorientierung.Vorlagen;

public class Buch {
    boolean ausgeliehen;
    public boolean isAusgeliehen() {
        return ausgeliehen;
    }
    public void setAusgeliehen(boolean ausgeliehen) {
        this.ausgeliehen = ausgeliehen;
    }

    double seitenanzahl;
    public double getSeitenanzahl() {
        return seitenanzahl;
    }

    public void setSeitenanzahl(double seitenanzahl) {
        this.seitenanzahl = seitenanzahl;
    }

    String titel;
    public String getTitel() {
        return titel;
    }

    public void setTitel(String titel) {
        this.titel = titel;
    }
}
