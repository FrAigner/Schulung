package Objektorientierung.Vorlagen;

public class Mitarbeiter extends PersonBasis{

    int personalnummer;
    int gehalt;

    // Konstruktor
    public Mitarbeiter(String vorname, String nachname, int personalnummer, int gehalt) {
        super(vorname, nachname);
        this.personalnummer = personalnummer;
        this.gehalt = gehalt;
    }

    // Getter & Setter
    public int getPersonalnummer() {
        return personalnummer;
    }

    public void setPersonalnummer(int personalnummer) {
        this.personalnummer = personalnummer;
    }

    public int getGehalt() {
        return gehalt;
    }

    public void setGehalt(int gehalt) {
        this.gehalt = gehalt;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\nMitarbeiter:" +
                "Personalnummer=" + personalnummer +
                ", Gehalt=" + gehalt +
                " " ;
    }
}
