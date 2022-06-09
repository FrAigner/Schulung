package de.pcCollege.Vorlage;

public class Mitarbeiter extends PersonBasis {
    //Zusätzliche Instanzen variabel
    String personalnummer;
    Double gehalt;

    // Konstruktor
    public Mitarbeiter(String vorname, String nachname, String personalnummer, Double gehalt) {
        super(vorname, nachname);
        this.personalnummer = personalnummer;
        this.gehalt = gehalt;
    }
    // Getter & Setter
    public String getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(String personalnummer) {
        this.personalnummer = personalnummer;
    }

    public Double getGehalt() {
        return gehalt;
    }

    public void setGehalt(Double gehalt) {
        this.gehalt = gehalt;
    }

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n  Mitarbeiter{" +
                "\n    personalnummer='" + personalnummer + '\'' +
                "\n    gehalt=" + gehalt +
                "} ";
    }
}
