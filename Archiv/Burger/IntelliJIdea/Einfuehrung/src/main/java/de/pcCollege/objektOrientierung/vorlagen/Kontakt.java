package de.pcCollege.objektOrientierung.vorlagen;

public class Kontakt extends PersonBasisOhneVergleich {
    // Zusätzliche Instanzenvariable
    private String email;
    private String telefon;

    public Kontakt() {
        super();
        this.email = "";
        this.telefon = "";
    }

    public Kontakt(String vorname, String nachname, String email, String telefon) {
        super(vorname, nachname);
        this.email = email;
        this.telefon = telefon;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefon() {
        return telefon;
    }

    public void setTelefon(String telefon) {
        this.telefon = telefon;
    }

    @Override
    public String toString() {
        return super.toString() + "\nKontakt{" +
                "email='" + email + '\'' +
                ", telefon='" + telefon + '\'' +
                "} ";
    }

}
