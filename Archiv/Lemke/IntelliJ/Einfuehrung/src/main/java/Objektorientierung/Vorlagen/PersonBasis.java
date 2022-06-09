package Objektorientierung.Vorlagen;

import java.util.Objects;

public class PersonBasis implements Comparable<PersonBasis> {
    private String vorname;
    private String nachname;

    // Konstruktor
    public PersonBasis() {
        this.vorname = "";
        this.nachname = "";
    }
    public PersonBasis(String vorname, String nachname) {
        this.vorname = vorname;
        this.nachname = nachname;
    }

    //Setter & Getter
    public String getVorname() {
        return vorname;
    }
    public void setVorname(String vorname) {
        this.vorname = vorname;
    }
    public String getNachname() {
        return nachname;
    }
    public void setNachname(String nachname) {
        this.nachname = nachname;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonBasis that = (PersonBasis) o;
        return Objects.equals(vorname, that.vorname) && Objects.equals(nachname, that.nachname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(vorname, nachname);
    }

    // to String Ausgabe
    @Override
    public String toString() {
        return "PersonBasis:" +
                "Vorname='" + vorname + '\'' +
                ", Nachname='" + nachname + '\'' +
                " ";
    }

    @Override
    public int compareTo(PersonBasis o) {
        if (!nachname.equals(o.nachname)) {
            return nachname.compareTo(o.nachname);
        } else {
            return vorname.compareTo(o.vorname);
        }
    }
}
