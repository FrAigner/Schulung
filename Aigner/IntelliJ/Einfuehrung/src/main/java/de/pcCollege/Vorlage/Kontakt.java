package de.pcCollege.Vorlage;

public class Kontakt extends PersonBasis {
    //Zusätzliche Instanzen variabel
    private String email;
    private String telefon;

    // Konstruktor
    public Kontakt() {
        super();
        this.email = email;
        this.telefon = telefon;
    }
    public Kontakt(String vorname, String nachname, String email, String telefon) {
        super(vorname, nachname);
        this.email = email;
        this.telefon = telefon;
    }

    // Getter & Setter
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

    //toString
    @Override
    public String toString() {
        return super.toString() + "\n  Kontakt{" +
                "\n    email='" + email + '\'' +
                "\n    telefon='" + telefon + '\'' +
                "} ";
    }
}
