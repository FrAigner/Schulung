package de.pcCollege.objektOrientierung.vorlagen;

import java.util.Comparator;

public class MitarbeiterAlt extends PersonBasis implements Comparator<MitarbeiterAlt> {
    /**
     * Die Klasse Mitarbeiter erbt von PersonBasis und damit die Instanzvariable vor- und nachname ...
     */
    private String personennummer;
    private double gehalt;
    // Konstruktoren

    /**
     * Im Standardkonstruktor wird ...
     */
    public MitarbeiterAlt() {
        super();
        this.personennummer = "";
    }

    public MitarbeiterAlt(String vorname, String nachname) {
        super(vorname, nachname);
    }

    public MitarbeiterAlt(String vorname, String nachname, String personennummer, double gehalt) {
        super(vorname, nachname);
        this.personennummer = personennummer;
        this.gehalt = gehalt;
    }
    // Setter, Getter, toString

    public String getPersonennummer() {
        return personennummer;
    }

    public void setPersonennummer(String personennummer) {
        this.personennummer = personennummer;
    }

//    @Override
//    public String toString() {
//        return "Mitarbeiter{" +
//                "personennummer='" + personennummer + '\'' +
//                "} " + super.toString();
//    }

    @Override
    public String getVorname() {
        return super.getVorname();
    }

    /**
     * @param o1 the first object to be compared.
     * @param o2 the second object to be compared.
     * @return
     */
    @Override
    public int compare(MitarbeiterAlt o1, MitarbeiterAlt o2) {

//       return o1.compareTo(o2);
        return o1.personennummer.compareTo(o2.personennummer); // Sortierung nach Personennummer
    }
}
