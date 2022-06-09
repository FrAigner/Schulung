package de.pcCollege.Vorlage;

public class Motorfahrzeug extends Fahrzeug{
    //Zusätzliche Instanzen variabel
    int leistung;

    // Konstruktor
    public Motorfahrzeug(int tempolimit, int leistung) {
        super(tempolimit);
        this.leistung = leistung;
    }

    // Getter & Setter

    public int getLeistung() {
        return leistung;
    }

    public void setLeistung(int leistung) {
        this.leistung = leistung;
    }

    //toString


    @Override
    public String toString() {
        return "Motorfahrzeug{" +
                "leistung=" + leistung +
                "} " + super.toString();
    }

}
